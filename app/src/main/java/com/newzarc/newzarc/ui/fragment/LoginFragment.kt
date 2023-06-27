package com.newzarc.newzarc.ui.fragment

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.firebase.auth.FirebaseAuth
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.FragmentLoginBinding
import com.newzarc.newzarc.dataclass.User
import com.newzarc.newzarc.ui.admin.AdminActivity
import com.newzarc.newzarc.ui.client.ClientActivity


class LoginFragment : Fragment() {

    private lateinit var binding : FragmentLoginBinding
    private lateinit var firebaseAuth : FirebaseAuth
    var userList = arrayListOf<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firebaseAuth = FirebaseAuth.getInstance()
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

//        binding.loginButton.setOnClickListener {
//            val email = binding.emailInputButton.text.toString()
//            val pass  =binding.passwordLogin.text.toString()
//
//            println("$email $pass credentials")
//
//            if (email.isNotEmpty() && pass.isNotEmpty() ) {
//                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener{
//                    if (it.isSuccessful) {
//                        getEmailDetails(email)
//                        moveToNewActivity(ClientActivity())
//                    }
//                }
//            }else {
//                Toast.makeText(activity, "Empty Fields are not allowed", Toast.LENGTH_SHORT).show()
//            }
//        }
        (activity as AppCompatActivity).supportActionBar?.hide()
        return binding.root
    }

    @SuppressLint("CommitPrefEdits")
    private fun getEmailDetails(email : String) {
        println("$email credentials")
        val reqQueue : RequestQueue = Volley.newRequestQueue(activity)
        val apiSample = "http://192.168.1.8:8080/user/$email"
        val request = JsonObjectRequest(Request.Method.GET, apiSample,null, { result ->
            val jsonObj = result
//            Log.d("Volley Example",jsonObj.toString())

//            for (i in 0 until jsonArray.length()) {
//                val jsonObj = jsonArray.getJSONObject(i)
//
                val news = User(
                    jsonObj.getInt("user_id"),
                    jsonObj.getString("name"),
                    jsonObj.getString("email"),
                    jsonObj.getString("password"),
                    jsonObj.getString("aboutMe"),
                    jsonObj.getString("phone"),
                    jsonObj.getString("userImage"),
                    jsonObj.getString("isSubscribe")
                )
                userList.add(news)
                Log.d("hello", userList.toString())

            val sharePerference = activity?.getSharedPreferences("userValues", Context.MODE_PRIVATE)
            val editor = sharePerference?.edit()
//            editor?.putString("USERVALUE", userList.toString())
            editor?.putString("USERID", userList[0].user_id.toString())
            editor?.putString("USERNAME", userList[0].name)
            editor?.putString("USEREMAIL", userList[0].email)
            editor?.putString("USERPASSWORD", userList[0].password)
            editor?.putString("USERABOUT", userList[0].aboutMe)
            editor?.putString("USERPHONE", userList[0].phone)
            editor?.putString("USERIMAGE", userList[0].userImage)
            editor?.putString("USERSUBSCRIBE", userList[0].isSubscribe)
            editor?.apply()


//            }
        }, {err ->
            Log.d("Volley Example error", err.toString())
        })
        reqQueue.add(request)
    }


    private fun moveToNewActivity(act : Activity) {
        val i = Intent(activity, act::class.java)
        startActivity(i)
        (activity as Activity?)!!.overridePendingTransition(0, 0)
    }
}