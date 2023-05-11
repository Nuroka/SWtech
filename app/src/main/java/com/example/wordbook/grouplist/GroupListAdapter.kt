package com.example.wordbook.grouplist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.wordbook.R
import com.example.wordbook.database.Group
import com.example.wordbook.databinding.ViewholderGroupBinding

class GroupListAdapter (val onMoveToGroup: (group: Group) -> Unit): ListAdapter<Group, GroupListAdapter.GroupListViewHolder>(GroupDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupListViewHolder {
        return GroupListViewHolder.from(parent)
    }

    //여기서 객체 클릭 제어
    override fun onBindViewHolder(holder: GroupListViewHolder, position: Int) {
        //얘만 해결하고 나머지 구현 후 run 해보기.
        holder.binding.grouptitle = getItem(position)
        holder.binding.onClickGroup = GroupClickListener(onMoveToGroup)
    }

    class GroupDiffCallback:DiffUtil.ItemCallback<Group>(){
        override fun areItemsTheSame(oldItem: Group, newItem: Group): Boolean {
            return oldItem.groupid == newItem.groupid
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
        //클릭해서 Group으로 이동하기 전에 word 설정하고 가기
        fun onGroupClick(group: Group) = onMoveToGroup(group)
    }
}
