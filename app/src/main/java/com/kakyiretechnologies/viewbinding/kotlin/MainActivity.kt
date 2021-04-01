package com.kakyiretechnologies.viewbinding.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakyiretechnologies.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val follow = "Follow @kakyirelastborn for more Android Content"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvFollow.text = follow
    }
}