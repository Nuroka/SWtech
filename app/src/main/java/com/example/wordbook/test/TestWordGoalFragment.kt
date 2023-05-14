package com.example.wordbook.test

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.wordbook.BaseActivity
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.databinding.FragmentTestDateBinding
import com.example.wordbook.databinding.FragmentTestWordGoalBinding
import com.example.wordbook.main.MainFragment
import com.opencsv.CSVReaderBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.InputStreamReader
import java.nio.charset.Charset


class TestWordGoalFragment : Fragment() {

    companion object {
        fun newInstance() = TestWordGoalFragment()
    }

    private lateinit var viewModel: TestWordGoalViewModel
    private lateinit var binding: FragmentTestWordGoalBinding
    private lateinit var backPressCallback: OnBackPressedCallback

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_test_word_goal, container, false)
        viewModel = ViewModelProvider(this).get(TestWordGoalViewModel::class.java)

        binding.viewModel = viewModel


        binding.buttonWord30.setOnClickListener {
            viewModel.wordGoalDb(30)
            addMainFragment()
        }

        binding.buttonWord50.setOnClickListener {
            viewModel.wordGoalDb(50)
            addMainFragment()
        }

        binding.buttonWord70.setOnClickListener {
            viewModel.wordGoalDb(70)
            addMainFragment()
        }


        /*//TestWordGoalViewModel의 words가 livedata여서 words가 업데이트 될때마다 처리해야 할 것
        viewModel.words.observe(viewLifecycleOwner, Observer { words ->
            Log.d("TestWordGoalFragment", "Words updated: $words")
        })*/

        return binding.root
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
