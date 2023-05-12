package com.example.wordbook.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface WordDao {
    @Insert
    suspend fun insert(word: Word): Long

    @Insert
    suspend fun insertAll(words: List<Word>)

    @Update
    suspend fun update(word: Word): Int

    @Query("select * from words")
    fun selectAllWithLiveData(): LiveData<List<Word>>

    @Query("select * from words")
    suspend fun selectAll(): List<Word>

    @Query("select * from words WHERE id = :id")
    suspend fun findById(id: Int): Word

    @Query("select count(*) from words")
    suspend fun getCount(): Int

    //추가한 부분
    // day에 해당하는 Word 목록을 반환하는 함수
    @Query("SELECT * FROM words WHERE day = :day ORDER BY id ASC")
    suspend fun getWordsOfDay(day: Int): List<Word>
}