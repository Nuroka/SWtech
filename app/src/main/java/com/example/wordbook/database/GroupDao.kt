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

    @Insert
    suspend fun insertGroupWord(word:GroupWord): Long

    @Delete
    suspend fun deleteGroupWord(word:GroupWord)

    @Query("select * from groupwords")
    suspend fun selectAllGroupWord(): List<GroupWord>

    @Query("select * from groupwords")
    fun getAllGroupWord(): LiveData<List<Group>>

    @Query("select groupword from groupwords where word_id = :id ")
    suspend fun findByGroupWordInWord(id: Int): Word

    @Query("select groupid_base_groupword from groupwords where groupid_base_groupword = :groupid ")
    suspend fun findByGroupidInGroupWord(groupid: Int): Int
    @Query("select groupword from groupwords where groupid_base_groupword = :groupid ")
    suspend fun findByGroupWord(groupid: Int): Int

    @Query("select count(*) from groupwords where groupid_base_groupword=:groupid")
    suspend fun getCountGroupWord(groupid: Int): Int
}