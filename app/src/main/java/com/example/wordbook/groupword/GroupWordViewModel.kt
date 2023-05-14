package com.example.wordbook.groupword

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.wordbook.database.GroupWord
import com.example.wordbook.database.getDatabaseGroupList
import com.example.wordbook.repository.GroupListRepository

//GroupId 받아서 처리를 해야함 GroupId -> GroupWordList로.
class GroupWordViewModel(application: Application, val mGroupId: Int):ViewModel() {
    private val repository = GroupListRepository(getDatabaseGroupList(application))

    val groupWordList = repository.getAllGroupWordList(mGroupId)

    suspend fun deleteGroupWord(groupword: GroupWord) {
        return repository.deleteGroupWord(groupword)
    }
}