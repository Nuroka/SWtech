package com.example.wordbook.GroupList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.example.wordbook.R

class GroupListBaseFragment : Fragment() {

    companion object{
        const val GROUP_LIST_FRAGMENT_CONTAINER_ID = R.id.group_list_container_view

        fun newInstane() = GroupListBaseFragment()
    }

    private lateinit var backPressCallback: OnBackPressedCallback

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_group_list_base, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(savedInstanceState==null){
            openGroupListFragment()
        }
    }

    override fun onDetach() {
        super.onDetach()

        getBackPressCallback().remove()
    }

    private fun openGroupListFragment(){
        childFragmentManager.beginTransaction()
            .replace(GROUP_LIST_FRAGMENT_CONTAINER_ID, GroupListFragment.newInstance())
            .setReorderingAllowed(true)
            .commit()
    }

    private fun getBackPressCallback(): OnBackPressedCallback{
        if(::backPressCallback.isInitialized) {
            backPressCallback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    val currentFragment = childFragmentManager.findFragmentById(
                        GROUP_LIST_FRAGMENT_CONTAINER_ID
                    )

                    if (currentFragment is GroupListFragment) {
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