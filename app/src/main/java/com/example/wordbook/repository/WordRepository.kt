package com.example.wordbook.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.wordbook.database.Word
import com.example.wordbook.database.WordDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WordRepository(private val database: WordDatabase) {
    fun getWordListByLiveData(): LiveData<List<Word>> {
        //return database.wordDao.selectAllWithLiveData()
        //단어 목록 역순으로 출력해서 추가한 단어가 맨 위에 노출되도록 함
        return Transformations.map(database.wordDao.selectAllWithLiveData()) { words ->
            words.reversed()
        }
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

    suspend fun delete(word: Word): Int {
        return withContext(Dispatchers.IO) {
            database.wordDao.delete(word)
        }
    }
}