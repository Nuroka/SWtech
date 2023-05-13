package com.example.wordbook.groupword

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordbook.R
import com.example.wordbook.addgroupword.AddGroupWordBaseFragment
import com.example.wordbook.database.GroupWord
import com.example.wordbook.databinding.FragmentGroupWordBinding
import com.example.wordbook.grouplist.GroupListBaseFragment
import com.example.wordbook.grouplist.GroupListFragment
import com.example.wordbook.groupwordinfo.GroupWordInfoFragment
import kotlinx.coroutines.launch

private const val ARG_GROUP_ID = "group_id"

//일단 검색 기능 구현 안함... 나중에 코드 참고해서 추가할 것.

class GroupWordFragment : Fragment() {
    companion object{
        fun newInstance(groupId: Int): GroupWordFragment{
            val fragment = GroupWordFragment()
            val args = Bundle()
            args.putInt(ARG_GROUP_ID, groupId)
            fragment.arguments = args

            return fragment
        }
    }

    private lateinit var binding: FragmentGroupWordBinding
    private lateinit var viewModel: GroupWordViewModel
    private lateinit var adapter: GroupWordAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val mGroupId = arguments?.let {
            it.getInt(ARG_GROUP_ID)
        } ?: -1

        val viewModelFactory = GroupWordViewModelFactory(requireActivity().application, mGroupId)

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_group_word, container, false)
        viewModel = ViewModelProvider(this, viewModelFactory).get(GroupWordViewModel::class.java)
        binding.viewModel = viewModel

        //단어 상세 정보로 이동
        binding.groupwordlist.layoutManager = LinearLayoutManager(requireContext())
        adapter = GroupWordAdapter(::moveToGroupWordInfo)
        binding.groupwordlist.adapter = adapter

        //클릭 감지 -> button
        binding.addGroupWordBtn.setOnClickListener{
            moveToAddGroupWord(mGroupId)
        }
        binding.groupDeleteBtn.setOnClickListener{

        }

        viewModel.groupWordList.observe(viewLifecycleOwner){
            //어답터 구현하고 오류 뜨는지 확인 필요
            adapter.submitList(it)
        }

        return binding.root
    }

    //프래그먼트 이동 정의

    //추가 버튼 누를 시 단어장에 단어 추가 프래그먼트로 이동
    private fun moveToAddGroupWord(groupId: Int){
        parentFragmentManager.beginTransaction()
            .replace(
                GroupWordBaseFragment.GROUP_WORD_FRAGMENT_CONTAINER_ID,
                AddGroupWordBaseFragment.newInstance(groupId)
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }

    // 단어장 클릭 시 그룹으로 이동
    private fun moveToGroupWordInfo(groupword: GroupWord){
        //main과 비교했을 때 parent프래그먼트 매니저는 메인 액티비티에서 시작할 때 쓰는 거라 상관 없을 듯.
        parentFragmentManager.beginTransaction()
            .replace(
                GroupWordBaseFragment.GROUP_WORD_FRAGMENT_CONTAINER_ID,
                //이건 좀 고려를 해봐야할 듯, 어떻게 넘어가야할지.
                GroupWordInfoFragment.newInstance(groupword.word_id)
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
        parentFragmentManager.popBackStack()
    }

}