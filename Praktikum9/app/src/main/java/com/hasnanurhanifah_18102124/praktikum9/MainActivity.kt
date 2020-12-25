package com.hasnanurhanifah_18102124.praktikum9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasnanurhanifah_18102124.praktikum9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = getString(R.string.main_title)
    }
}