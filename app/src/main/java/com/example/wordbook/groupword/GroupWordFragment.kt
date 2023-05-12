package com.example.wordbook.groupword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.wordbook.R
import com.example.wordbook.databinding.FragmentGroupWordBinding

class GroupWordFragment : Fragment() {

    //인스턴스 생성
    companion object{
        fun newInstance() = GroupWordFragment()
    }

    //viewModel 구현 필요
    private lateinit var viewModel: GroupWordViewModel
    //xml data binding 연결 구현 필요
    private lateinit var binding: FragmentGroupWordBinding
    //GroupWord Adapter 구현 필요
    //private lateinit var adapter: GroupWordAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_group_word,container, false)
        viewModel = ViewModelProvider(this).get(GroupWordViewModel::class.java)

        binding.viewModel = viewModel
        //data바인딩 필요


        return binding.root
    }

}