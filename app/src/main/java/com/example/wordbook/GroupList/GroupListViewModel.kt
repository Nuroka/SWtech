package com.example.wordbook.GroupList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.wordbook.database.getDatabaseGroup
import com.example.wordbook.repository.GroupRepository

class GroupListViewModel(application: Application):AndroidViewModel(application) {
    private val repository = GroupRepository(getDatabaseGroup(application))

    val groups = repository.getGroupListByLiveData()
}