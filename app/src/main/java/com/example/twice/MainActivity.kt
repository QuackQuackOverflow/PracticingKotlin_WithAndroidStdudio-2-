package com.example.twice

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<ImageView>(R.id.mem1)
        val button2 = findViewById<ImageView>(R.id.mem2)
        val button3 = findViewById<ImageView>(R.id.mem3)
        val button4 = findViewById<ImageView>(R.id.mem4)
        val button5 = findViewById<ImageView>(R.id.mem5)
        val button6 = findViewById<ImageView>(R.id.mem6)
        val button7 = findViewById<ImageView>(R.id.mem7)
        val button8 = findViewById<ImageView>(R.id.mem8)
        val button9 = findViewById<ImageView>(R.id.mem9)

        button1.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)

        }

        button2.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)

        }

        button3.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)

        }

        button4.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)

        }

        button5.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)

        }

        button6.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)

        }

        button7.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)

        }

        button8.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)

        }

        button9.setOnClickListener {

            val intent = Intent(this, ViewImangeInside::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)

        }
    }
}