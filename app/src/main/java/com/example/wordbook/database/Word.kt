package com.example.wordbook.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words")
data class Word(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val english: String,
    val means: String,
    val timestamp: String,
    val day: Int // day 속성 추가
) {
    companion object {
        fun make(english: String, means: String, day: Int): Word {
            return Word(0, english, means, System.currentTimeMillis().toString(), day) //day 변수 추가
        }

        fun make(id: Int, english: String, means: String, day: Int): Word {
            return Word(id, english, means, System.currentTimeMillis().toString(), day) //day 변수 추가
        }
    }
}