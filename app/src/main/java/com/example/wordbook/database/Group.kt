package com.example.wordbook.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "groups")
data class Group (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val grouptitle: String
    ){
    companion object{
        fun make(title: String): Group{
            return Group(0, title)
        }
        fun make(id:Int, title:String):Group{
            return Group(id,title)
        }
    }
}