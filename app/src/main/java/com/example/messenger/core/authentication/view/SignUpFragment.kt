package com.example.messenger.core.authentication.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.messenger.databinding.FragmentSignBinding

class SignUpFragment : Fragment() {

    private var _binding: FragmentSignBinding? = null
    private val binding get() = _binding!!
    private lateinit var  loginCallback: LoginCallback

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is LoginCallback){
            loginCallback = context
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}