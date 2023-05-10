package com.example.wordbook.GroupList

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.constraintlayout.widget.Group
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.wordbook.R
import com.example.wordbook.database.getDatabase
import com.example.wordbook.database.getDatabaseGroup
import com.example.wordbook.databinding.ViewholderGroupBinding

class GroupListAdapter (val onMoveToGroup: (group: Group)->Unit): ListAdapter<Group, GroupListAdapter.GroupListViewHolder>(GroupDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupListViewHolder {
        return GroupListViewHolder.from(parent)
    }

    //여기서 객체 클릭 제어
    override fun onBindViewHolder(holder: GroupListViewHolder, position: Int) {
        holder.binding.grouptitle = getItem(position)
        holder.binding.onClickGroup = GroupClickListener(onMoveToGroup)
    }


    class GroupDiffCallback:DiffUtil.ItemCallback<Group>(){
        override fun areItemsTheSame(oldItem: Group, newItem: Group): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Group, newItem: Group): Boolean {
            return oldItem.equals(newItem)
        }
    }

    class GroupListViewHolder private constructor(val binding: ViewholderGroupBinding) :
        RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): GroupListViewHolder {
                return GroupListViewHolder(
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

    //여기서 객체 클릭, 삭제 관여
    class GroupClickListener(val onMoveToGroup: (group: Group) -> Unit){

        fun onGroupClick(group: Group) = onMoveToGroup(group)
    }
}