package com.example.wordbook.test

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.wordbook.BaseActivity
import com.example.wordbook.R
import com.example.wordbook.databinding.FragmentMainBinding
import com.example.wordbook.databinding.FragmentTestResultBinding
import com.example.wordbook.main.MainFragment
import com.example.wordbook.main.MainViewModel


class TestResultFragment : Fragment() {

    companion object {
        fun newInstance() = TestResultFragment()
    }

    private lateinit var viewModel: TestResultViewModel
    private lateinit var binding: FragmentTestResultBinding
    private lateinit var backPressCallback: OnBackPressedCallback


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_test_result, container, false)
        viewModel = ViewModelProvider(this).get(TestResultViewModel::class.java)

        binding.viewModel = viewModel


        var testCorrectCount = 10


        binding.moveToMain.setOnClickListener {
            addMainFragment()
        }

        return binding.root

        /*// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_result, container, false)*/
    }

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

    private fun addMainFragment(){
        /*val viewModel = ViewModelProvider(this)
            .get(TestWordGoalViewModel::class.java)
        viewModel.fillInDbFromCsv(selectedRange)*/
        parentFragmentManager.beginTransaction()
            .replace(BaseActivity.FRAGMENT_CONTAINER_ID, MainFragment.newInstance())
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }


}