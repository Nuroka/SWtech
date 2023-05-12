package com.example.wordbook.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.wordbook.R
import com.example.wordbook.databinding.ActivityTestWordGoalBinding
import com.example.wordbook.main.MainFragment
import kotlinx.coroutines.Dispatchers.Main


class TestWordGoal : AppCompatActivity() {

    //추가한 부분
    private lateinit var binding: ActivityTestWordGoalBinding
    private lateinit var viewModel: TestViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_test_word_goal)

        //추가한 부분
        binding = ActivityTestWordGoalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(TestViewModel::class.java)

        binding.buttonWord30.setOnClickListener{
            viewModel.numOfWords = 30 // "30개" 버튼을 누르면 numOfWordsfmf 30으로 변경
        }

        binding.buttonWord50.setOnClickListener{
            viewModel.numOfWords = 50 // "50개" 버튼을 누르면 numOfWordsfmf 50으로 변경
        }

        binding.buttonWord70.setOnClickListener{
            viewModel.numOfWords = 70 // "70개" 버튼을 누르면 numOfWordsfmf 70으로 변경
        }


        /*binding.buttonMoveTomain.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, MainFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }*/



    }
}