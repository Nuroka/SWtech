package com.example.wordbook.register

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.wordbook.R
import com.example.wordbook.database.Group
import com.example.wordbook.databinding.FragmentRegisterGroupBinding

class RegisterGroupFragment : Fragment() {

    companion object{
        fun newInstance() = RegisterGroupFragment()
    }

    private lateinit var binding: FragmentRegisterGroupBinding
    private lateinit var viewModel: RegisterGroupViewModel
    private lateinit var backPressCallback: OnBackPressedCallback

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_group, container, false)
        viewModel = ViewModelProvider(this).get(RegisterGroupViewModel::class.java)

        binding.registerGroupBtn.setOnClickListener{
            val title = binding.inputGroupTitle.text.toString()

            viewModel.registerGroup(Group.make(title))
            destroy()
        }
        return binding.root
    }

    override fun onAttach(context: Context){
        super.onAttach(context)

        requireActivity().onBackPressedDispatcher.addCallback(this,getBackPressCallback())
    }

    override fun onDetach() {
        super.onDetach()

        getBackPressCallback().remove()
    }

    private fun getBackPressCallback(): OnBackPressedCallback {
        if (!::backPressCallback.isInitialized) {
            backPressCallback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    destroy()
                }
            }
        }
        return backPressCallback
    }

    private fun destroy() {
        parentFragmentManager.popBackStack()
    }

}