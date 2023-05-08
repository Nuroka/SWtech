package com.example.wordbook.register

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.wordbook.database.Group
import com.example.wordbook.database.getDatabaseGroup
import com.example.wordbook.repository.GroupRepository
import kotlinx.coroutines.launch

class RegisterGroupViewModel(application: Application):AndroidViewModel(application) {
    private val repository = GroupRepository(getDatabaseGroup(application))

    fun registerGroup(group: Group){
        viewModelScope.launch {
            repository.insertgroup(group)
        }
    }

}


