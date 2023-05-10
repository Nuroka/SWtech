package com.example.wordbook.vocalist

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.example.wordbook.R

class VocaListBaseFragment : Fragment() {
    companion object {
        const val VOCA_LIST_FRAGMENT_CONTAINER_ID = R.id.voca_list_container_view
        fun newInstance() = VocaListBaseFragment()
    }

    private lateinit var backPressCallback: OnBackPressedCallback

    //Base 뷰 생성
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_voca_list_base, container, false)
    }

    //Base 위에 올릴 List 뷰 생성
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            openVocaListFragment()
        }
    }

    //Activity함... 이건 뭘 뜻하는 지 모르겠음 검색필요.
    override fun onAttach(context: Context) {
        super.onAttach(context)

        requireActivity().onBackPressedDispatcher.addCallback(this, getBackPressCallback())
    }

    override fun onDetach() {
        super.onDetach()

        getBackPressCallback().remove()
    }

    //이건 Base라서.. VocaListFragment(List 뷰)로 가는 함수 정의함.
    private fun openVocaListFragment() {
        childFragmentManager.beginTransaction()
            .replace(VOCA_LIST_FRAGMENT_CONTAINER_ID, VocaListFragment.newInstance())
            .setReorderingAllowed(true)
            .commit()
    }

    //뒤로 갈 때 전 단계 프래그먼트 호출함
    private fun getBackPressCallback(): OnBackPressedCallback {
        if (!::backPressCallback.isInitialized) {
            backPressCallback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    val currentFragment = childFragmentManager.findFragmentById(VOCA_LIST_FRAGMENT_CONTAINER_ID)
                    //내가 호출할 프래그먼트 말함. -> 만약 현재 프래그먼트가 List라면 지운다!
                    if (currentFragment is VocaListFragment) {
                        destroy()
                    }
                }
            }
        }
        return backPressCallback
    }

    //뒤로 가기 할 때 본인은 삭제시키고 화면를 호출한 부모 프래그먼트를 Back스택에서 pop하여 화면에 보여줌. 위 함수에 쓰인다.
    private fun destroy() {
        parentFragmentManager.popBackStack()
    }
}