package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.front_page,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when(item.itemId){
           R.id.itemLogin -> {
               Intent(this,LoginActivity::class.java).also {
                   startActivity(it)
               }
           }
           R.id.itemAboutUs ->{
               Intent(this,AboutMe::class.java).also {
                   startActivity(it)
               }
           }
           R.id.itemProfile -> {
               Intent(this,Profile::class.java).also {
                   startActivity(it)
               }
           }
       }
        return true
    }
}