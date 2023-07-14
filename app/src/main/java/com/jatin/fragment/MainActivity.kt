package com.jatin.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jatin.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var fragmentInterface: FragmentInterface//initializing interface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPass.setOnClickListener {
            if (binding.etName.text.toString().isEmpty()) {
                binding.etName.error = "this field is not optional"
            }
            else
            {
                fragmentInterface.changeFragmentText()

            }
        }
        binding.btnIncrement.setOnClickListener {
            fragmentInterface.increment()
        }
        binding.btndecrement.setOnClickListener {
            fragmentInterface.decrement()
        }
    }
    fun clearActivityData() {
        binding.etName.setText("")
    }
}
