package com.example.wordbook.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import com.example.wordbook.BaseActivity
import com.example.wordbook.R
import com.example.wordbook.databinding.FragmentMainBinding
import com.example.wordbook.grouplist.GroupListBaseFragment
import com.example.wordbook.study.StudyFragment
import com.example.wordbook.test.TestFragment
import com.example.wordbook.vocalist.UserVocaListBaseFragment
import com.example.wordbook.vocalist.VocaListBaseFragment

class MainFragment : Fragment() {

//    companion object {
//        fun newInstance() = MainFragment()
//    }
    companion object {
        fun newInstance(userID: String?) = MainFragment().apply {
            arguments = Bundle().apply {
                putString("userID", userID)
            }
        }
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentMainBinding
    private lateinit var supportFragmentManager: FragmentManager

    private var userID: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.viewModel = viewModel

        viewModel.mStudyMovingState.observe(viewLifecycleOwner) {
            when (it) {
                MovingState.IDLE -> {}
                MovingState.MOVE -> {
                    addStudyFragment()
                    viewModel.setStudyMovingStateIdle()
                }
                MovingState.FAIL -> {
                    Toast.makeText(context, R.string.error_limit_1_word, Toast.LENGTH_SHORT).show()
                    viewModel.setStudyMovingStateIdle()
                }
            }
        }

        viewModel.mTestMovingState.observe(viewLifecycleOwner) {
            when (it) {
                MovingState.IDLE -> {}
                MovingState.MOVE -> {
                    addTestFragment()
                    viewModel.setTestMovingStateIdle()
                }
                MovingState.FAIL -> {
                    Toast.makeText(context, R.string.error_limit_4_word, Toast.LENGTH_SHORT).show()
                    viewModel.setTestMovingStateIdle()
                }
            }
        }

        binding.register.setOnClickListener {
            addVocaListFragment()
        }

        binding.mainTogroupBtn.setOnClickListener {
            addGroupFragment()
        }

        userID = arguments?.getString("userID")

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        supportFragmentManager = requireActivity().supportFragmentManager
    }

    private fun addVocaListFragment() {
        if (userID == "admin") {
            // admin 아이디인 경우 다른 화면으로 이동
            // 예시: AdminVocaListFragment로 이동
            supportFragmentManager
                .beginTransaction()
                .setReorderingAllowed(true)
                .replace(BaseActivity.FRAGMENT_CONTAINER_ID, VocaListBaseFragment.newInstance())
                .addToBackStack(null)
                .commit()
        } else {
            // 일반 사용자인 경우 다른 화면으로 이동
            // 예시: UserVocaListFragment로 이동
            supportFragmentManager
                .beginTransaction()
                .setReorderingAllowed(true)
                .replace(BaseActivity.FRAGMENT_CONTAINER_ID, UserVocaListBaseFragment.newInstance())
                .addToBackStack(null)
                .commit()
        }

//        supportFragmentManager
//            .beginTransaction()
//            .setReorderingAllowed(true)
//            .replace(BaseActivity.FRAGMENT_CONTAINER_ID, VocaListBaseFragment.newInstance())
//            .addToBackStack(null)
//            .commit()
    }

    private fun addTestFragment() {
        supportFragmentManager
            .beginTransaction()
            .setReorderingAllowed(true)
            .replace(BaseActivity.FRAGMENT_CONTAINER_ID, TestFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }

    private fun addStudyFragment() {
        supportFragmentManager
            .beginTransaction()
            .setReorderingAllowed(true)
            .replace(BaseActivity.FRAGMENT_CONTAINER_ID, StudyFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }

    private fun addGroupFragment(){
        supportFragmentManager
            .beginTransaction()
            .setReorderingAllowed(true)
            .replace(BaseActivity.FRAGMENT_CONTAINER_ID, GroupListBaseFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }
}