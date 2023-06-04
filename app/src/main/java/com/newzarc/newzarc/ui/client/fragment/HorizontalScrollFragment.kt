package com.newzarc.newzarc.ui.client.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.FragmentHorizontalScrollBinding

class HorizontalScrollFragment : Fragment() {

    private lateinit var binding : FragmentHorizontalScrollBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHorizontalScrollBinding.inflate(inflater, container, false)

        binding.food.setOnClickListener {
            replaceFragment(FoodUserFragment())
        }
        binding.science.setOnClickListener {
            replaceFragment(ScienceUserFragment())
        }
        binding.business.setOnClickListener {
            replaceFragment(BusinessUserFragment())
        }
        binding.health.setOnClickListener {
            replaceFragment(HealthUserFragment())
        }
        binding.sports.setOnClickListener {
            replaceFragment(SportsUserFragment())
        }

        return binding.root
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = parentFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }

}