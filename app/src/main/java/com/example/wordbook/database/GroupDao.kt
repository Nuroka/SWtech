package com.example.wordbook.database

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface GroupDao {
    @Insert
    suspend fun insertgroup(group: Group): Long

    @Delete
    suspend fun deletegroup(group: Group)
    @Query("select * from groups")
    fun selectAllGroup(): List<Group>
    @Query("select * from groups")
    fun getAllGroup(): LiveData<List<Group>>

    @Query("select * from words WHERE id = :id")
    suspend fun findById(id: Int): Group

    @Query("select count(*) from groups")
    suspend fun countGroupNum(): Int
}