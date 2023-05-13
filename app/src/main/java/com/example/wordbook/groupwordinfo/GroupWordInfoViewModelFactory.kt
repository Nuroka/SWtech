package com.example.wordbook.groupwordinfo

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class GroupWordInfoViewModelFactory(private val application: Application,
                               private val wordId: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GroupWordInfoViewModel::class.java)) {
            return GroupWordInfoViewModel(application, wordId) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}