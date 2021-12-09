package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

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
           R.id.itemLogin -> Toast.makeText(this,"Login clicked",Toast.LENGTH_SHORT).show()
           R.id.itemAboutUs -> Toast.makeText(this,"About us clicked",Toast.LENGTH_SHORT).show()
           R.id.itemProfile -> Toast.makeText(this,"Profile clicked",Toast.LENGTH_SHORT).show()
       }
        return true
    }
}