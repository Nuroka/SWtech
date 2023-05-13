package com.example.wordbook.addgroupword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordbook.R
import com.example.wordbook.databinding.FragmentAddGroupWordBinding


private const val ARG_GROUP_ID = "group_id"

class AddGroupWordFragment : Fragment() {

    companion object{
        fun newInstance(groupId: Int): AddGroupWordFragment {
            val fragment = AddGroupWordFragment()
            val args = Bundle()
            args.putInt(ARG_GROUP_ID, groupId)
            fragment.arguments = args

            return fragment
        }
    }

    private lateinit var binding: FragmentAddGroupWordBinding
    private lateinit var viewModel: AddGroupWordViewModel
    private lateinit var adapter: AddGroupWordAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mGroupId = arguments?.let {
            it.getInt(ARG_GROUP_ID)
        } ?: -1

        val viewModelFactory = AddGroupWordViewModelFactory(requireActivity().application, mGroupId)
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_add_group_word, container, false)
        viewModel = ViewModelProvider(this, viewModelFactory).get(AddGroupWordViewModel::class.java)
        binding.viewModel = viewModel

        binding.wordlist.layoutManager = LinearLayoutManager(requireContext())
        //어답터 수정 필요
        adapter = AddGroupWordAdapter()
        binding.wordlist.adapter = adapter

        viewModel.wordList.observe(viewLifecycleOwner){
            //어답터 구현하고 오류 뜨는지 확인 필요
            adapter.submitList(it)
        }
        return binding.root
    }

//    private fun addWordInGroup(groupId: Int){
//
//    }
}