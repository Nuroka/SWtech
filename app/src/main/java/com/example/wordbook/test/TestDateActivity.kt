package com.example.wordbook.test

import android.content.Context
import android.graphics.drawable.DrawableContainer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.database.getDatabase
import com.example.wordbook.databinding.ActivityTestDateBinding //추가
import com.example.wordbook.databinding.FragmentTestBinding
import com.example.wordbook.main.MovingState
import com.example.wordbook.repository.WordRepository
import com.example.wordbook.test.testdate.TestDateViewModel
import kotlinx.coroutines.launch


class TestDateActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityTestDateBinding
    //private lateinit var viewModel: TestViewModel
    private lateinit var viewModel: TestDateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_date)

        viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(TestDateViewModel::class.java)


        /*binding = ActivityTestDateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(TestViewModel::class.java)
        binding.buttonDay1.setOnClickListener{ viewModel.onClickDay(1)}
        binding.buttonDay2.setOnClickListener{ viewModel.onClickDay(2)}
        binding.buttonDay3.setOnClickListener{ viewModel.onClickDay(3)}
        binding.buttonDay4.setOnClickListener{ viewModel.onClickDay(4)}
        binding.buttonDay5.setOnClickListener{ viewModel.onClickDay(5)}
        binding.buttonDay6.setOnClickListener{ viewModel.onClickDay(6)}
        binding.buttonDay7.setOnClickListener{ viewModel.onClickDay(7)}
        binding.buttonDay8.setOnClickListener{ viewModel.onClickDay(8)}
        binding.buttonDay9.setOnClickListener{ viewModel.onClickDay(9)}
        binding.buttonDay10.setOnClickListener{ viewModel.onClickDay(10)}
        binding.buttonDay11.setOnClickListener{ viewModel.onClickDay(11)}
        binding.buttonDay12.setOnClickListener{ viewModel.onClickDay(1)}*/



        /*//날짜 선택 전에 단어 목료 설멍 페이지에서 선택한 단어 개수 가져오기
        val wordGoal = intent.getIntExtra("wordGoal", 30)

        // viewModel에서 LiveData인 mTestUnit을 observe한다.
        viewModel.mTestUnit.observe(this, { testUnit ->
            val candidates = testUnit.candidates.shuffled()

            // 가져온 단어 개수에 맞게 후보 단어를 자른다
            val trimmedCandidates = candidates.take(wordGoal-1).plus(testUnit.question)
            val shuffledCandidates = trimmedCandidates.shuffled()

        })*/


    }

    fun onClickDay(day: Int){
        viewModel.onClickDay(day)
    }



}