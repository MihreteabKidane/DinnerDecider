package com.miu.mdp.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val menuList: MutableList<String> = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // check and choose type of food
        decideBtn.setOnClickListener {
            val random: Int = (0 until (menuList.size)).random()
            orderTxt.text = menuList[random]
            when (random) {
                0 -> imageView.setImageResource(R.drawable.burger_sandwich)
                1 -> imageView.setImageResource(R.drawable.pizza)
                2 -> imageView.setImageResource(R.drawable.pizza_mexican)
                3 -> imageView.setImageResource(R.drawable.pizza_american)
                4 -> imageView.setImageResource(R.drawable.chinese)
                else -> imageView.setImageResource(R.drawable.dd_logo)
            }
        }
        // add new food if you don't like what is available
        addBtn.setOnClickListener {
            val newFood : String = addTxt.text.toString()
            menuList.add(newFood)
            orderTxt.text = newFood
            imageView.setImageResource(R.drawable.dd_logo)
            addTxt.text = null
        }

    }
}