package com.example.wordbook.vocalist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.databinding.FragmentVocaListBinding
import com.example.wordbook.edit.EditVocaFragment
import com.example.wordbook.register.RegisterVocaFragment

//여기서 다른 프래그먼트로 이동하는 함수 정의 하는 듯함
//어답터는 감지해서 그걸 실행하도록 도와주는 것.
class VocaListFragment : Fragment() {

    //인스턴스 생성
    companion object {
        fun newInstance() = VocaListFragment()
    }

    //바인딩, 뷰모델, 어답터 변수 설정
    private lateinit var viewModel: VocaListViewModel
    private lateinit var binding: FragmentVocaListBinding
    private lateinit var adapter: VocaListAdapter

    //뷰 생성하기
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //바인딩 생성
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_voca_list, container, false)
        //뷰모델 얻기
        viewModel = ViewModelProvider(this).get(VocaListViewModel::class.java)

        //뷰모델 바인딩함
        binding.viewModel = viewModel

        binding.list.layoutManager = LinearLayoutManager(requireContext())
        //moveTo화면으로 이동함.
        //내가 구현하는 경우는 버튼은 밑의 클릭 감지로 해결하면됨
        //1. 2 모두 해당됨(추가, 삭제)
        //근데 요소 접근 시 -> word data접근 시에는 이것이 필요할 듯.
        adapter = VocaListAdapter(::moveToEditVoca)
        binding.list.adapter = adapter

        //add 클릭을 감지하면 다음 행동을 실행함
        binding.add.setOnClickListener {
            moveToRegisterVoca()
        }

        //옵저버가 관찰하면서 view모델 갱신하고 List를 제출
        viewModel.vocas.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        return binding.root
    }

    //여기서 어답터에 있던 move해서 edit으로 가는 동작 제어함.
    //어답터는 감지해서 여기로 보냄.
    private fun moveToEditVoca(word: Word) {
        //Edit으로 가면 값을 저장하고 이 다음을 실행
        parentFragmentManager.beginTransaction()
            .replace(
                VocaListBaseFragment.VOCA_LIST_FRAGMENT_CONTAINER_ID,
                EditVocaFragment.newInstance(word.id)
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }

    private fun moveToRegisterVoca() {
        //voca 추가하는 동작시 값을 저장하고 이 다음을 실행
        //뷰를 갱신하는 듯.
        parentFragmentManager.beginTransaction()
            .replace(
                VocaListBaseFragment.VOCA_LIST_FRAGMENT_CONTAINER_ID,
                RegisterVocaFragment.newInstance()
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }
}