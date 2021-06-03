package com.example.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.menu, menu)
        return true
    }
}

