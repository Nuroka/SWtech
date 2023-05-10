package com.example.wordbook.repository

import androidx.lifecycle.LiveData
import com.example.wordbook.database.Group
import com.example.wordbook.database.GroupDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GroupRepository(private val database:GroupDatabase){

    fun getGroupListByLiveData(): LiveData<List<Group>>{
        return database.groupDao.getAllGroup()
    }

    suspend fun getGroupList(): List<Group>{
        return withContext(Dispatchers.IO) {
            database.groupDao.selectAllGroup()
        }
    }

    suspend fun insertgroup(group: Group):Long{
        return withContext(Dispatchers.IO){
            database.groupDao.insertgroup(group)
        }
    }

    suspend fun deletegroup(group:Group){
        return withContext(Dispatchers.IO){
            database.groupDao.deletegroup(group)
        }
    }

    suspend fun findById(id: Int):Group{
        return withContext(Dispatchers.IO){
            database.groupDao.findById(id)
        }
    }

    suspend fun getCounts():Int{
        return withContext(Dispatchers.IO){
            database.groupDao.countGroupNum()
        }
    }
}