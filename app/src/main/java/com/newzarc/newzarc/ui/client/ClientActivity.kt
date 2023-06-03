package com.newzarc.newzarc.ui.client

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.ActivityClientBinding
import com.newzarc.newzarc.ui.client.fragment.AccountUserFragment
import com.newzarc.newzarc.ui.client.fragment.HomeFragment
import com.newzarc.newzarc.ui.client.fragment.NewsViewFragment

class ClientActivity : AppCompatActivity() {

    private lateinit var binding : ActivityClientBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClientBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment(), "Home")


        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> replaceFragment(HomeFragment(), "Home")
                R.id.news -> replaceFragment(NewsViewFragment(), "News")
                R.id.account -> replaceFragment(AccountUserFragment(), "User Details")
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment, string: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
        title = string
    }
}