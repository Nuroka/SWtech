package com.example.wordbook.groupwordinfo

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wordbook.database.GroupWord
import com.example.wordbook.database.Word
import com.example.wordbook.database.getDatabase
import com.example.wordbook.database.getDatabaseGroupList
import com.example.wordbook.repository.GroupListRepository
import kotlinx.coroutines.launch

// taggedUnion
sealed class GroupWordInfoViewModelState {
    object Loading : GroupWordInfoViewModelState()
    class Ready(val groupword: GroupWord): GroupWordInfoViewModelState()
}

class GroupWordInfoViewModel(application: Application, val mGroupWordId: Int): ViewModel() {
    private val repository = GroupListRepository(getDatabaseGroupList(application))

    private var _state = MutableLiveData<GroupWordInfoViewModelState>(GroupWordInfoViewModelState.Loading)
    val state: LiveData<GroupWordInfoViewModelState>
        get() = _state

    init {
        load(mGroupWordId)
    }

    private fun load(wordId: Int) {
        if (wordId == -1) {
            return
        }

        viewModelScope.launch {
            val word = repository.findGroupWordbyId(wordId)

            _state.value = GroupWordInfoViewModelState.Ready(word)
        }
    }

    //그룹에서 단어 삭제 기능
    suspend fun deleteGroupWord(wordId: Int) {
        val word = repository.findGroupWordbyId(wordId)
        return repository.deleteGroupWord(word)
    }
}