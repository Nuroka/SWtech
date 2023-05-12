package com.example.wordbook.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wordbook.R
import android.widget.TextView

class TestResult : AppCompatActivity() {
    private lateinit var correctCountTextView: TextView
    private val testViewModel: TestViewModel by lazy { TestViewModel(application) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_result)

        // TestView 초기화
        correctCountTextView = findViewById(R.id.correct_count_textview)

        // 정답 개수 가져오기
        val correctCount = testViewModel.getCorrectCount()

        // TestView에 정답 개수 설정
        correctCountTextView.text = correctCount.toString()

    }
}