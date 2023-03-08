package me.dio.simulator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulator.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
    }
}