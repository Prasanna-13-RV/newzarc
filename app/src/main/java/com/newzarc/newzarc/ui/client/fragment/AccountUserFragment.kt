package com.newzarc.newzarc.ui.client.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.FragmentAccountUserBinding
import com.newzarc.newzarc.databinding.FragmentHomeUserBinding

class AccountUserFragment : Fragment() {

    private lateinit var binding: FragmentAccountUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentAccountUserBinding.inflate(inflater, container,false)


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

//        print("Hello $userList")
        Log.d("Hello WOrld", userList)

        binding.profileName.text = name
        binding.aboutMe.text = aboutMe
        binding.email.text = email
        binding.aboutMe.text = aboutMe
        binding.phone.text = phone
//        binding.userImage.text = userImage

        if (userImage != "null") {
            Glide.with(requireContext()).load(userImage).into(binding.userImage)
        }

        binding.editPage.setOnClickListener {
            replaceFragment(EditAccountFragment(), "Edit Profile")
        }



        return binding.root
    }

    private fun replaceFragment(fragment: Fragment, string: String) {
        val fragmentManager = parentFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
//        title = string
    }


}