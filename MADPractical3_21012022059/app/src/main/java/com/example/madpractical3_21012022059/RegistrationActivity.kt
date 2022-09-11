package com.example.madpractical3_21012022059

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madpractical3_21012022059.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener{it1->
            when(it1.itemId)
            {
                R.id.bottom_nav_login->
                {
                    Intent(this,LoginActivity::class.java).also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}