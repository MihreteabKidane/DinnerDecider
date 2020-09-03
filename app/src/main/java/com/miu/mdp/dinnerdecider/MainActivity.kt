package com.miu.mdp.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideButton.setOnClickListener {
            var list: MutableList<String> = mutableListOf<String>()
            list.add("Hamburger")
            list.add("Pizza")
            list.add("Mexican")
            list.add("American")
            list.add("Chinese")
            val listSize = list.size
            val randomNumber = (0..(listSize + 1)).random()
            when (randomNumber - 1) {
                0 -> {
                    textView.text = list[randomNumber]
                    //image.setImageResource(R.drawable.american)
                }
                1 -> {
                    textView.text = list[randomNumber]
                    //image.setImageResource(R.drawable.chinese)
                }
                2 -> {
                    textView.text = list[randomNumber]
                    //image.setImageResource(R.drawable.burger_beef)
                }
                3 -> {
                    textView.text = list[randomNumber]
                    // image.setImageResource(R.drawable.mexican)
                }
                else -> {
                    textView.text = list[randomNumber]
                    //image.setImageResource(R.drawable.pizza)
                }

            }
        }
    }
    fun decideFood(view: View) {}
}