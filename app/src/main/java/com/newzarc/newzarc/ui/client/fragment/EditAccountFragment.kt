package com.newzarc.newzarc.ui.client.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.FragmentEditAccountBinding

class EditAccountFragment : Fragment() {

    private lateinit var binding : FragmentEditAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEditAccountBinding.inflate(inflater, container, false)

        val sharePerference = activity?.getSharedPreferences("userValues", Context.MODE_PRIVATE)

        val userList = sharePerference?.getString("USERID", "").toString()
        val user_id  = sharePerference?.getString("USERID", "").toString()
        val  name = sharePerference?.getString("USERNAME", "").toString()
        val email  = sharePerference?.getString("USEREMAIL", "").toString()
        val password  = sharePerference?.getString("USERPASSWORD", "").toString()
        val  aboutMe = sharePerference?.getString("USERABOUT", "").toString()
        val  phone = sharePerference?.getString("USERPHONE", "").toString()
        val userImage  = sharePerference?.getString("USERIMAGE", "").toString()
        val  isSubscribe = sharePerference?.getString("USERSUBSCRIBE", "").toString()

//        binding.profileEmail : Edi

        return binding.root
    }
}