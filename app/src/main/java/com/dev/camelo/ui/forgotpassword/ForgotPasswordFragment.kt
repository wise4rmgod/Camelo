package com.dev.camelo.ui.forgotpassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dev.camelo.R
import com.dev.camelo.databinding.FragmentForgotpasswordBinding

class ForgotPasswordFragment : Fragment() {
lateinit var binding: FragmentForgotpasswordBinding
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_forgotpassword, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)

        return root
    }
}