package com.example.wordbook.groupword

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.wordbook.database.Group
import com.example.wordbook.database.getDatabaseGroupList
import com.example.wordbook.repository.GroupListRepository

class GroupWordViewModel(application: Application, val group: Group):ViewModel() {
    private val repository = GroupListRepository(getDatabaseGroupList(application))
    private var groupword = repository.getGroupListByLiveData()

}