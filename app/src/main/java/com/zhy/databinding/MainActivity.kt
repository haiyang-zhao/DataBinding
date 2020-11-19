package com.zhy.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.zhy.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var age: Int = 18
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        var user = User("张三", age++)
        binding.user = user

        binding.btn.setOnClickListener {
            user = User("张三", age++)
            binding.user = user
        }

        binding.btn2.setOnClickListener {
            age++
            user.age = age
        }
    }
}