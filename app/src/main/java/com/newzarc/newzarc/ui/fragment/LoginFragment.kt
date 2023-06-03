package com.newzarc.newzarc.ui.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.FragmentLoginBinding
import com.newzarc.newzarc.ui.admin.AdminActivity
import com.newzarc.newzarc.ui.client.ClientActivity


class LoginFragment : Fragment() {

    private lateinit var binding : FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)


        binding.registerPageButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        binding.loginButton.setOnClickListener {
            moveToNewActivity(AdminActivity())
        }

        binding.loginGoogleButton.setOnClickListener {
            moveToNewActivity(ClientActivity())
        }

        (activity as AppCompatActivity).supportActionBar?.hide()
        return binding.root
    }

    private fun moveToNewActivity(act : Activity) {
        val i = Intent(activity, act::class.java)
        startActivity(i)
        (activity as Activity?)!!.overridePendingTransition(0, 0)
    }
}