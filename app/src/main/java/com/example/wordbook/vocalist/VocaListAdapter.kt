package com.example.wordbook.vocalist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.databinding.ViewholderVocaBinding

class VocaListAdapter(val onMoveToEditVoca: (word: Word) -> Unit) : ListAdapter<Word, VocaListAdapter.VocaViewHolder>(VocaDiffCallback()) {

    //여기서는 편집하면 edit창으로 가도록 했음 그러니까 List클릭하면 edit으로 가도록 처리함.
    //그래서 파라미터로 저렇게 전달하는 듯함. 나도 비슷하게 Group 창으로 이동하도록 하면 될 듯.
    //아!!!!!!! 리스트 클릭하면 어답터가 감지해서 연결해주는 거였다. 그래 맞다.
    //그래서 나머지 버튼은 프래그먼트에서 정의해주는데
    //얘는 리스트 요소 클릭해서 더 자세한 내용 들어가니까 안되는 거였다. 흠.. 근데 나는 버튼인데
    //뷰 홀더 정의함
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VocaViewHolder {
        return VocaViewHolder.from(parent)
    }

    //바인딩 뷰 홀더 정의함.
    //홀더를 통해 word입력된 곳의
    override fun onBindViewHolder(holder: VocaViewHolder, position: Int) {
        //포지션에 해당하는 item(word)을 얻음.
        holder.binding.word = getItem(position)
        //클릭 감지 -> VocaClickListener 함수 실행.-> 맨밑에 정의되어 있음
        //만약 내가 List자체가 아니라 그 안의 요소에 접근하여 이동하고 싶다면
        //뷰 홀더 xml 코드에서 onClick이 적용되는 코드의 범위를 바꿔 주면 될 것 같다.
        holder.binding.onClick = VocaClickListener(onMoveToEditVoca)
    }

    //DiffCallback -> 같은지 다른지 확인하는 작업인듯.
    //같으면 갱신해주어야 하기 때문.
    class VocaDiffCallback : DiffUtil.ItemCallback<Word>() {
        override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
            return oldItem == newItem
        }

    }


    //View홀더 -> 갱신하는 작업인 듯.
    class VocaViewHolder private constructor(val binding: ViewholderVocaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): VocaViewHolder {
                return VocaViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        R.layout.viewholder_voca,
                        parent,
                        false
                    )
                )
            }
        }
    }

    //vaca 값 클릭하면 word 객체 가지고 edit창으로 이동하도록 Listener 정의함.
    class VocaClickListener(val onMoveToEditVoca: (word: Word) -> Unit) {
        fun onVocaClick(word: Word) = onMoveToEditVoca(word)
    }
}