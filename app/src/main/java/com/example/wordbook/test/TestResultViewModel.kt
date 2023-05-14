package com.example.wordbook.test

import android.app.Application
import android.graphics.ColorSpace
import androidx.lifecycle.AndroidViewModel

class TestResultViewModel(application: Application): AndroidViewModel(application) {

    private lateinit var viewModel: TestViewModel
    var testCorrectCount = viewModel.correctCount


}