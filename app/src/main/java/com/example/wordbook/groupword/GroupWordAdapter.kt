package com.example.wordbook.groupword

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.wordbook.R
import com.example.wordbook.database.Group
import com.example.wordbook.database.GroupWord
import com.example.wordbook.databinding.ViewholderGroupBinding
import com.example.wordbook.databinding.ViewholderGroupwordBinding

class GroupWordAdapter(val onMoveToGroupInfo:(groupword: GroupWord)->Unit) : ListAdapter<GroupWord, GroupWordAdapter.GroupWordViewHolder>(GroupWordDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupWordViewHolder {
        return GroupWordViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: GroupWordViewHolder, position: Int) {
        holder.binding.groupword = getItem(position)
        holder.binding.onClickGroupWord = GroupWordClickListener(onMoveToGroupInfo)
    }


    class GroupWordDiffCallback: DiffUtil.ItemCallback<GroupWord>(){
        override fun areItemsTheSame(oldItem: GroupWord, newItem: GroupWord): Boolean {
            return oldItem.word_id == newItem.word_id
        }

        override fun areContentsTheSame(oldItem: GroupWord, newItem: GroupWord): Boolean {
            return oldItem.equals(newItem)
        }
    }

    class GroupWordViewHolder private constructor(val binding: ViewholderGroupwordBinding) :
        RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): GroupWordViewHolder {
                return GroupWordViewHolder(
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
    class GroupWordClickListener(val onMoveToGroupInfo: (groupword: GroupWord) -> Unit){
        fun onGroupWordClick(groupword: GroupWord) = onMoveToGroupInfo(groupword)
    }
}
