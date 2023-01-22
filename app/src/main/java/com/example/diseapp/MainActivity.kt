package com.example.diseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diseapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)

        binding?.buttonClick?.setOnClickListener {

            val randomDice = (1..6).random()

            val drawableImage =

                //this data need to store that's why we make drawableImage otherwise it show exception
                when(randomDice){
                1-> R.drawable.dice_1
                2-> R.drawable.dice_2
                3-> R.drawable.dice_3
                4-> R.drawable.dice_4
                5-> R.drawable.dice_5
                else-> R.drawable.dice_6

                }
            binding?.imageDice?.setImageResource(drawableImage)

        }

    }
}