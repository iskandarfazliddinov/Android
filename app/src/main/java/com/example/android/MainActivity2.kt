package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.apply {
            title = "Toolbar title"
            subtitle = "toolbar sub title"

            setDisplayShowHomeEnabled(true)
            setDisplayUseLogoEnabled(true)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menyu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.til -> {
                Toast.makeText(applicationContext, "Til", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.men_haqimda -> {
                men()
                return true
            }
            R.id.chiqish -> {
                finish()
                System.exit(0)
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }

    fun CardClic(view: View) {
        if (view.id == R.id. car_1)
            android()
        else if (view.id == R.id.car_2)
            ios()
        else if (view.id == R.id.car_3)
            fultter()
        else if (view.id == R.id.car_4)
            xamarin()
        else if (view.id == R.id.car_5)
            men()

    }

    private fun men() {
        val intent = Intent(this, MalumotActivity::class.java)
        intent.putExtra("NAME", "men")
        startActivity(intent)
    }

    private fun xamarin() {
        val intent = Intent(this, MalumotActivity::class.java)
        intent.putExtra("NAME", "xamarin")
        startActivity(intent)
    }

    private fun fultter() {
        val intent = Intent(this, MalumotActivity::class.java)
        intent.putExtra("NAME", "fultter")
        startActivity(intent)
    }

    private fun ios() {
        val intent = Intent(this, MalumotActivity::class.java)
        intent.putExtra("NAME", "ios")
        startActivity(intent)
    }

    private fun android() {
        val intent = Intent(this, MalumotActivity::class.java)
        intent.putExtra("NAME", "android")
        startActivity(intent)
    }




}