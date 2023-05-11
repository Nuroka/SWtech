package com.example.wordbook.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "groups")
data class Group (
    @PrimaryKey(autoGenerate = true)
    val groupid: Int = 0,
    val grouptitle: String
    ){
    //만약 생성에 문제생기면 여기인 거임...!
    companion object{
        fun make(id: Int, title:String){
            Group(id, title)
        }
        fun make(title: String){
            Group(0, title)
        }
    }
}