package com.example.wordbook.groupword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordbook.R
import com.example.wordbook.databinding.FragmentGroupWordBinding
import com.example.wordbook.edit.EditVocaViewModelFactory
import com.example.wordbook.grouplist.GroupListAdapter

private const val ARG_GROUP_ID = "group_id"

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
            inflater, R.layout.fragment_voca_list, container, false)
        viewModel = ViewModelProvider(this, viewModelFactory).get(GroupWordViewModel::class.java)
        binding.viewModel = viewModel

        //단어 상세 정보로 이동
        binding.groupwordlist.layoutManager = LinearLayoutManager(requireContext())
        adapter = GroupWordAdapter(::moveToWordInfo)
        binding.groupwordlist.adapter = adapter

        //클릭 감지 -> button
        binding.addGroupWordBtn.setOnClickListener{
            moveToAddGroupWord()
        }

        //그룹 삭제 버튼
        binding.groupDeleteBtn.setOnClickListener{

        }

        //취소 버튼
        binding.backBtn.setOnClickListener{

        }


        viewModel.groupWordList.observe(viewLifecycleOwner){
            //어답터 구현하고 오류 뜨는지 확인 필요
            adapter.submitList(it)
        }

        return binding.root
    }

    //프래그먼트 이동 정의
}