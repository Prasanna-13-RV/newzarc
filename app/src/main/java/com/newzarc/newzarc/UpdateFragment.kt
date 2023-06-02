package com.newzarc.newzarc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newzarc.newzarc.databinding.FragmentAddBinding
import com.newzarc.newzarc.databinding.FragmentUpdateBinding

class UpdateFragment : Fragment() {
    
    private lateinit var binding : FragmentUpdateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUpdateBinding.inflate(inflater, container, false)

        val updateButton = binding.updateNews

        updateButton.setOnClickListener {
            val title = binding.newsTitleInput.text.toString()
            val description = binding.newsDescriptionInput.text.toString()
            val content = binding.newsContentInput.text.toString()
            val pubDate = binding.newsDateInput.text.toString()
            val image_url = binding.newsImageUrlInput.text.toString()

            updateData(title, description, content, pubDate, image_url)
        }
        return binding.root
    }

    private fun updateData(title: String, description: String, content: String, pubDate: String, imageUrl: String) {

    }

}