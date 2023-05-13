package com.example.wordbook.groupword

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.databinding.FragmentGroupWordBinding
import com.example.wordbook.edit.EditVocaFragment
import com.example.wordbook.edit.EditVocaViewModelFactory
import com.example.wordbook.grouplist.GroupListAdapter
import com.example.wordbook.vocalist.VocaListBaseFragment
import kotlinx.coroutines.launch

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

    private lateinit var backPressCallback: OnBackPressedCallback

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
            lifecycleScope.launch {
            viewModel.deleteGroup(mGroupId)
            destroy()
            }
        }

        //취소 버튼
        binding.backBtn.setOnClickListener{
            destroy()
        }


        viewModel.groupWordList.observe(viewLifecycleOwner){
            //어답터 구현하고 오류 뜨는지 확인 필요
            adapter.submitList(it)
        }

        return binding.root
    }

    //프래그먼트 이동 정의

    private fun moveToAddGroupWord(groupId: Int) {
        //Edit으로 가면 값을 저장하고 이 다음을 실행
        parentFragmentManager.beginTransaction()
            .replace(
                VocaListBaseFragment.VOCA_LIST_FRAGMENT_CONTAINER_ID,
                EditVocaFragment.newInstance(word.id)
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }

    // 이게 필요할지 모르겠음.... 오류걸릴 것 같은데 확인 필요
    override fun onAttach(context: Context) {
        super.onAttach(context)

        requireActivity().onBackPressedDispatcher.addCallback(this, getBackPressCallback())
    }

    override fun onDetach() {
        super.onDetach()

        getBackPressCallback().remove()
    }

    private fun getBackPressCallback(): OnBackPressedCallback {
        if (!::backPressCallback.isInitialized) {
            backPressCallback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    destroy()
                }
            }
        }
        return backPressCallback
    }


    private fun destroy(){
        parentFragmentManager.popBackStack()
    }
}