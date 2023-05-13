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

        val mGordId = arguments?.let {
            it.getInt(ARG_GROUP_ID)
        } ?: -1

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_voca_list, container, false)
        viewModel = ViewModelProvider(this).get(GroupWordViewModel::class.java)
        binding.viewModel = viewModel

        return binding.root
    }
}