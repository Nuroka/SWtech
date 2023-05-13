package com.example.wordbook.grouplist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordbook.R
import com.example.wordbook.database.Group
import com.example.wordbook.databinding.FragmentGroupListBinding
import com.example.wordbook.groupword.GroupWordFragment
import com.example.wordbook.register.RegisterGroupFragment

class GroupListFragment : Fragment() {

    companion object {
        fun newInstance() = GroupListFragment()
    }

    private lateinit var viewModel: GroupListViewModel
    private lateinit var binding: FragmentGroupListBinding
    private lateinit var adapter: GroupListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_group_list, container, false)
        viewModel = ViewModelProvider(this).get(GroupListViewModel::class.java)

        binding.viewModel = viewModel

        binding.grouplistItem.layoutManager = LinearLayoutManager(requireContext())
        //adapter 부분 수정하기.

        adapter = GroupListAdapter(::moveToGroup)
        binding.grouplistItem.adapter = adapter


        //삭제 버튼.
        binding.addGroupBtn.setOnClickListener{
            moveToRegisterGroup()
        }

        //변경 일어나면 얘가 관찰해서 list 제출함 아..
        // 이놈이 그거다 얘가 전달 받아서 뷰 제출하는 거네
        // 그럼 일단 다 생성하고 그다음에 data따라 달라지도록 수정하는 걸로 하자.
        viewModel.groups.observe(viewLifecycleOwner){
            //it 람다 -> 함수 인자 말함. 그럼 함수 인자가 잘못되어 있다는 것 같은데
            //
            adapter.submitList(it)
        }

        return binding.root
    }

    //추가 버튼 누를 시 단어장 추가 프래그먼트로 이동
    private fun moveToRegisterGroup(){
        parentFragmentManager.beginTransaction()
            .replace(
                GroupListBaseFragment.GROUP_LIST_FRAGMENT_CONTAINER_ID,
                RegisterGroupFragment.newInstance()
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }

    // 단어장 클릭 시 그룹으로 이동
    private fun moveToGroup(group: Group){
        parentFragmentManager.beginTransaction()
            .replace(
                GroupListBaseFragment.GROUP_LIST_FRAGMENT_CONTAINER_ID,
                //이건 좀 고려를 해봐야할 듯, 어떻게 넘어가야할지.
                GroupWordFragment.newInstance(group.groupid)
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }

}