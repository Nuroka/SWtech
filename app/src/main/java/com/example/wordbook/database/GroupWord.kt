package com.example.wordbook.database

import androidx.room.Entity
import androidx.room.*
import androidx.room.PrimaryKey

//추후 추가했을 때 word id와 동일하면 갱신하는 형태로 할 예정
@Entity(tableName = "groupwords",
    foreignKeys = arrayOf(
        ForeignKey(
            entity = Group::class,
            parentColumns = arrayOf("groupid"),
            childColumns = arrayOf("groupid_base_groupword"),
            onDelete = ForeignKey.CASCADE
        )
    )
)
data class GroupWord (
    @PrimaryKey(autoGenerate = true)
    val word_id: Int,
    //group 연결 연산을 위해 사용함
    var groupid_base_groupword: Int,
    var groupword: Word
){
    companion object{
        fun make(word_id: Int, groupid_base_groupword: Int, word:Word){
            GroupWord(word_id, groupid_base_groupword, word)
        }
    }
}

/*,
        ForeignKey(
            entity = Word::class,
            ParentColums = arrayOf("id"),
            childColumns = arrayOf("word_id"),
            onDelete = ForeignKey.CASCADE
        )

         */