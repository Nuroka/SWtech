package com.example.wordbook.groupword

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wordbook.database.Group
import com.example.wordbook.database.Word
import com.example.wordbook.database.getDatabaseGroupList
import com.example.wordbook.repository.GroupListRepository
import kotlinx.coroutines.launch

//GroupId 받아서 처리를 해야함 GroupId -> GroupWordList로.
class GroupWordViewModel(application: Application, val mGroupId: Int):ViewModel() {
    private val repository = GroupListRepository(getDatabaseGroupList(application))

    val groupWordList = repository.getAllGroupWordList(mGroupId)

    //현재 화면에 필요한 data 처리 -> 그룹 삭제밖에 없음.
    fun deleteGroup(groupId: Int) {
        val group = repository.findById(groupId)
        repository.deletegroup(group)
    }
}