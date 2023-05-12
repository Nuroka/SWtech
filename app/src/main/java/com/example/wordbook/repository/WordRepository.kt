package com.example.wordbook.repository

import androidx.lifecycle.LiveData
import com.example.wordbook.database.Word
import com.example.wordbook.database.WordDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WordRepository(private val database: WordDatabase) {
    fun getWordListByLiveData(): LiveData<List<Word>> {
        return database.wordDao.selectAllWithLiveData()
    }

    suspend fun getWordList(): List<Word> {
        return withContext(Dispatchers.IO) {
            database.wordDao.selectAll()
        }
    }

    suspend fun save(word: Word): Long {
        return withContext(Dispatchers.IO) {
            database.wordDao.insert(word)
        }
    }

    suspend fun update(word: Word): Int {
        return withContext(Dispatchers.IO) {
            database.wordDao.update(word)
        }
    }

    suspend fun findById(id: Int): Word {
        return withContext(Dispatchers.IO) {
            database.wordDao.findById(id)
        }
    }

    suspend fun getCounts(): Int {
        return withContext(Dispatchers.IO) {
            database.wordDao.getCount()
        }
    }

    //추가한 부분
    //WordDao에서 추가한 함수를 사용하여 그룹화된 단어장 가져오기
    suspend fun getWordsOfDay(day: Int): List<Word>{
        return database.wordDao.getWordsOfDay(day)
        //return words.filter { it.day == day }
    }
}