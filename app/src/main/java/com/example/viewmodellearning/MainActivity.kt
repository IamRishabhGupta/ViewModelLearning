package com.example.viewmodellearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodellearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel:MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        mainViewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)
        setText()
        binding.button.setOnClickListener {
            increment()
        }

    }

    private fun setText() {
        binding.textView2.text=mainViewModel.count.toString()
    }
    fun increment()
    {
        mainViewModel.increment()
        setText()
    }
}