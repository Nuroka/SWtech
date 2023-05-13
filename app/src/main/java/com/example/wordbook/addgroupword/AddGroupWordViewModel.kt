package com.example.wordbook.addgroupword

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Transaction
import com.example.wordbook.database.GroupWord
import com.example.wordbook.database.getDatabase
import com.example.wordbook.database.getDatabaseGroupList
import com.example.wordbook.repository.GroupListRepository
import com.example.wordbook.repository.WordRepository

class AddGroupWordViewModel (application: Application, val mGroupId: Int): ViewModel() {
    //추가하다가 오류나면 여기 확인해보기. DB 중복 접근이라서 생길 확률도 있음!
    private val repositoryWord = WordRepository(getDatabase(application))
    private val repositoryGroup = GroupListRepository(getDatabaseGroupList(application))

    val wordList = repositoryWord.getWordListByLiveData()

//    그룹에 추가.
    suspend fun addWordInGroup(groupId: Int, wordId:Int): Long {
        val word = repositoryWord.findById(groupId)
        val groupword = GroupWord(word.id, mGroupId, word.english, word.means)
        return repositoryGroup.insertGroupWord(groupword)
    }
}