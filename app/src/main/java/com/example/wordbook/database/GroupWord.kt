package com.example.wordbook.database

import androidx.room.Entity
import androidx.room.*
import androidx.room.PrimaryKey

@ForeignKey(
    
)
//추후 추가했을 때 word id와 동일하면 갱신하는 형태로 할 예정
@Entity(tableName = "groupwords")
data class GroupWord (
    @PrimaryKey(autoGenerate = true)
    val word_id: Int,
    //group 연결 연산을 위해 사용함
    var groupid_base_groupword: Int,
    var word_in_groupword: Word
){
    companion object{
        fun make(word_id: Int, groupid_base_groupword: Int, word:Word){
            GroupWord(word_id, groupid_base_groupword, word)
        }
    }
}