package com.example.wordbook.edit

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


//Factory 재정의 필요함. 거기서 group id 얻어서 wordlist로 와야할 듯.
class EditVocaViewModelFactory(private val application: Application,
                               private val wordId: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EditVocaViewModel::class.java)) {
            return EditVocaViewModel(application, wordId) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}