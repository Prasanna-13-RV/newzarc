package com.newzarc.newzarc.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.firebase.auth.FirebaseAuth
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.FragmentRegisterBinding
import org.json.JSONException
import org.json.JSONObject

class RegisterFragment : Fragment() {

    private lateinit var binding : FragmentRegisterBinding
    private lateinit var firebaseAuth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firebaseAuth = FirebaseAuth.getInstance()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)


        binding.loginLink.setOnClickListener {
            it.findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

        binding.signupbutton.setOnClickListener {
            val name = binding.nameInput.text.toString()
            val email = binding.emailInput.text.toString()
            val password  = binding.passwordInputSignup.text.toString()
            val confirmPass = binding.conPasswordInput.text.toString()

            println("$email $password $confirmPass credentials")

            if (email.isNotEmpty() && password.isNotEmpty() && confirmPass.isNotEmpty()) {
                if (password == confirmPass) {
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                        if (it.isSuccessful) {
                            postData(name, email, password)
                            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
                        }
                    }
                }
                else {
                    Toast.makeText(activity , "Password is not matching" , Toast.LENGTH_SHORT).show()
                }
            }else {
                Toast.makeText(activity, "Empty Fields are not allowed", Toast.LENGTH_SHORT).show()
            }
        }


        (activity as AppCompatActivity).supportActionBar?.hide()
        return binding.root
    }

    private fun postData(name : String, email : String, password : String) {
        val requestQueue = Volley.newRequestQueue(activity)
        val `object` = JSONObject()
        try {
            //input your API parameters
            `object`.put("name", name)
            `object`.put("email", email)
            `object`.put("password", password)
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        Log.d("pbject", `object`.toString())
        // Enter the correct url for your api service site
        val url = "http://192.168.1.8:8080/user/create"
        val jsonObjectRequest = JsonObjectRequest(Request.Method.POST, url, `object`, { response ->
            Log.d("pbjectresponse", response.toString())
            Toast.makeText(activity, response.toString(), Toast.LENGTH_LONG).show()
        }) {error ->
            Log.d("pbjecterror", error.toString())
            Toast.makeText(activity, error.message, Toast.LENGTH_LONG).show()
        }
        requestQueue.add(jsonObjectRequest)
    }


}