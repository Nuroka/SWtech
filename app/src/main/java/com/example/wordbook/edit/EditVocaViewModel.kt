package com.example.wordbook.edit

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wordbook.database.Word
import com.example.wordbook.database.getDatabase
import com.example.wordbook.repository.WordRepository
import kotlinx.coroutines.launch

// taggedUnion
sealed class EditVocaViewModelState {
    object Loading : EditVocaViewModelState()
    class Ready(val word: Word): EditVocaViewModelState()
}

class EditVocaViewModel(application: Application, val mWordId: Int): ViewModel() {
    private val repository = WordRepository(getDatabase(application))

    private var _state = MutableLiveData<EditVocaViewModelState>(EditVocaViewModelState.Loading)
    val state: LiveData<EditVocaViewModelState>
        get() = _state

    init {
        load(mWordId)
    }

    suspend fun updateWord(english: String, means: String, day: Int): Int { //Word 클래스에 day를 추가하여 여기도 수정된 부분
        if (mWordId == -1) {
            return -1
        }

        return repository.update(Word.make(mWordId, english, means, day)) //day 추가
    }

    private fun load(wordId: Int) {
        if (wordId == -1) {
            return
        }

        viewModelScope.launch {
            val word = repository.findById(wordId)

            _state.value = EditVocaViewModelState.Ready(word)
        }
    }
}