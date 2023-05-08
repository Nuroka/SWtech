package com.example.wordbook.GroupList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordbook.R
import com.example.wordbook.databinding.FragmentGroupListBinding
import com.example.wordbook.register.RegisterGroupFragment
import java.security.acl.Group

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
        adapter = GroupListAdapter(::moveToRegisterGroup)
        binding.grouplistItem.adapter = adapter

        binding.addGroupBtn.setOnClickListener{
            moveToRegisterGroup()
        }

        viewModel.groups.observe(viewLifecycleOwner){
            adapter.submintList(it)
        }

        return binding.root
    }

    //단어장 삭제 버튼 누를 시 단어장 삭제 이벤트

    //추가 버튼 누를 시 단어장 추가 프래그먼트로 이동
    private fun moveToRegisterGroup(group:Group){
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
    //private fun moveToGroup(group:Group){}

}