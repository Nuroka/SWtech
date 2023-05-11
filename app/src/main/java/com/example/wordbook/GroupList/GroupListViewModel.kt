package com.example.wordbook.grouplist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.wordbook.database.getDatabaseGroupList
import com.example.wordbook.repository.GroupListRepository

class GroupListViewModel(application: Application):AndroidViewModel(application) {
    private val repository = GroupListRepository(getDatabaseGroupList(application))
    val groups = repository.getGroupListByLiveData()
}