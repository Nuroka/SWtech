package com.example.wordbook.repository

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Query
import com.example.wordbook.database.Group
import com.example.wordbook.database.GroupListDatabase
import com.example.wordbook.database.GroupWord
import com.example.wordbook.database.Word
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GroupListRepository(private val database:GroupListDatabase) {
    //GroupDao에 GroupWord 선언 -> GroupWord list 반환하는 함수도 사용할 것.
    fun getGroupListByLiveData(): LiveData<List<Group>> {
        return database.groupDao.getAllGroup()
    }

    suspend fun getGroupList(): List<Group> {
        return withContext(Dispatchers.IO) {
            database.groupDao.selectAllGroup()
        }
    }

    suspend fun insertgroup(group: Group): Long {
        return withContext(Dispatchers.IO) {
            database.groupDao.insertgroup(group)
        }
    }

    suspend fun deletegroup(group: Group) {
        return withContext(Dispatchers.IO) {
            database.groupDao.deletegroup(group)
        }
    }

    suspend fun findByGroup(id: Int): Group {
        return withContext(Dispatchers.IO) {
            database.groupDao.findById(id)
        }
    }

    suspend fun getCounts(): Int {
        return withContext(Dispatchers.IO) {
            database.groupDao.countGroupNum()
        }
    }


    //Group Word Data 처리하는 함수

    suspend fun insertGroupWord(word: GroupWord): Long {
        return withContext(Dispatchers.IO) {
            database.groupDao.insertGroupWord(word)
        }
    }

    suspend fun deleteGroupWord(word: GroupWord) {
        return withContext(Dispatchers.IO) {
            database.groupDao.deleteGroupWord(word)
        }
    }

    suspend fun selectAllGroupWordList(groupid: Int): List<GroupWord> {
        return withContext(Dispatchers.IO) {
            database.groupDao.selectAllGroupWordList(groupid)
        }
    }

    fun getAllGroupWordList(groupid: Int): LiveData<List<GroupWord>> {
        return database.groupDao.getAllGroupWordList(groupid)
    }

    suspend fun findGroupWordbyId(id: Int): GroupWord {
        return withContext(Dispatchers.IO) {
            database.groupDao.findGroupWordbyId(id)
        }
    }
}
/*
    suspend fun InsertGroupWord(word:GroupWord){
        return withContext(Dispatchers.IO){
            database.group.InsertGroupWord(word)
        }
    }

    suspend fun countGroupWordNum(): Int{
        return withContext(Dispatchers.IO) {
            database.groupListDao.countGroupWordNum()
        }
    }



    suspend fun deleteGroupWord(word: GroupWord) {
        return withContext(Dispatchers.IO) {
            database.groupListDao.deleteGroupWord(word)
        }
    }
}

 */
