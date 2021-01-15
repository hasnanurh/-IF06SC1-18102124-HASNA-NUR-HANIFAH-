package com.hasnanurhanifah_18102124.praktikum11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hasnanurhanifah_18102124.praktikum11.databinding.ActivitySigninBinding

class SigninActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSign.setOnClickListener(this)
        binding.tvSignUp.setOnClickListener(this)
        binding.btnEmail.setOnClickListener(this)
        binding.btnPhone.setOnClickListener(this)
        auth = Firebase.auth
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

}