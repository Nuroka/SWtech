package com.example.wordbook.groupword

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.example.wordbook.R

class GroupWordBaseFragment : Fragment() {
    companion object{
        const val GROUP_WORD_FRAGMENT_CONTAINER_ID = R.id.group_word_container_view
        fun newInstance() = GroupWordBaseFragment()
    }

    private lateinit var backPressCallback: OnBackPressedCallback

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_group_word_base, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //GroupWord프래그 먼트 구현 후 확인
        if(savedInstanceState==null){
            //openGroupWordFragment()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        requireActivity().onBackPressedDispatcher.addCallback(this, getBackPressCallback())
    }

    override fun onDetach(){
        super.onDetach()
        getBackPressCallback().remove()
    }

    private fun getBackPressCallback(): OnBackPressedCallback{
        if(!::backPressCallback.isInitialized){
            backPressCallback = object : OnBackPressedCallback(true){
                override fun handleOnBackPressed() {
                    val currentFragment = childFragmentManager.findFragmentById(
                        GROUP_WORD_FRAGMENT_CONTAINER_ID)
                    if(currentFragment is GroupWordFragment){
                        destroy()
                    }
                }
            }
        }
        return backPressCallback
    }

    private fun destroy(){
        parentFragmentManager.popBackStack()
    }
}