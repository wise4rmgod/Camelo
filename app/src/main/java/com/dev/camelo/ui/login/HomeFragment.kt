package com.dev.camelo.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.dev.camelo.R
import com.dev.camelo.databinding.FragmentLoginBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.loginbtn.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_profileFragment)
        }

        return view
    }
}