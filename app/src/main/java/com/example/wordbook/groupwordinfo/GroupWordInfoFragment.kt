
package com.example.wordbook.groupwordinfo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.wordbook.R
import com.example.wordbook.databinding.FragmentGroupWordInfoBinding
import kotlinx.coroutines.launch

private const val ARG_GROUPWORD_ID = "groupword_id"

class GroupWordInfoFragment : Fragment() {

    companion object {
        fun newInstance(groupwordId: Int): GroupWordInfoFragment {
            val fragment = GroupWordInfoFragment()
            val args = Bundle()
            args.putInt(ARG_GROUPWORD_ID, groupwordId)
            fragment.arguments = args

            return fragment
        }
    }

    private lateinit var binding: FragmentGroupWordInfoBinding
    private lateinit var viewModel: GroupWordInfoViewModel
    private lateinit var backPressCallback: OnBackPressedCallback

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_group_word_info, container, false)

        val mGroupWordId = arguments?.let {
            it.getInt(ARG_GROUPWORD_ID)
        } ?: -1

        Log.d("TestWordInput", "wordId : $mGroupWordId")

        val viewModelFactory = GroupWordInfoViewModelFactory(requireActivity().application, mGroupWordId)
        viewModel = ViewModelProvider(this, viewModelFactory).get(GroupWordInfoViewModel::class.java)

        viewModel.state.observe(viewLifecycleOwner) {
            when (it) {
                is GroupWordInfoViewModelState.Ready -> binding.groupwordInfo = it.groupword
//                is EditVocaViewModelState.Loading -> Toast.makeText(this, "loading", Toast.LENGTH_SHORT).show()
            }
        }

        //삭제기능 구현 -> 클릭시 삭제 함수 호출해 삭제
        binding.groupDeleteBtn.setOnClickListener{
            lifecycleScope.launch {
                viewModel.deleteGroupWord(mGroupWordId)
                destroy()
            }
        }

        //뒤로 가기 버튼
        binding.backInfoBtn.setOnClickListener{
            destroy()
        }

        return binding.root
    }

    //생명주기 관리
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

    private fun destroy() {
        parentFragmentManager.popBackStack()
    }
}