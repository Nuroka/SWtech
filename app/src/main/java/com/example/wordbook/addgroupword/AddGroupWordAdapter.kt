package com.example.wordbook.addgroupword

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.databinding.ViewholderAddGroupwordBinding

//추가...하기...
class AddGroupWordAdapter() : ListAdapter<Word, AddGroupWordAdapter.AddGroupWordViewHolder>(AddGroupWordDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddGroupWordViewHolder {
        return AddGroupWordViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: AddGroupWordViewHolder, position: Int) {

        holder.binding.word = getItem(position)
        holder.binding.onClickAddWord = AddGroupWordClickListener()
    }


    class AddGroupWordDiffCallback: DiffUtil.ItemCallback<Word>(){
        override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
            return oldItem.equals(newItem)
        }
    }

    class AddGroupWordViewHolder private constructor(val binding: ViewholderAddGroupwordBinding) :
        RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): AddGroupWordViewHolder {
                return AddGroupWordViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        R.layout.viewholder_group,
                        parent,
                        false
                    )
                )
            }
        }
    }
    class AddGroupWordClickListener(){
        fun onAddGroupWordClick(word: Word){
//            //여기에 추가하기 구현.....+함수도 명시하기.
        }
    }
}
