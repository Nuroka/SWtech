package com.example.wordbook.vocalist

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wordbook.database.getDatabase
import com.example.wordbook.repository.WordRepository

class VocaListViewModel(application: Application): AndroidViewModel(application) {
    private val repository = WordRepository(getDatabase(application))

    //아 여기서 view에 보여줄 모든 데이터를 가져오는 거구나 그럼 여기를 좀 수정하면 될 듯.
    val vocas = repository.getWordListByLiveData()
}