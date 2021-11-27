package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun CardClic(view: View) {
        if (view.id ==2131230822 )
            android()
        else if (view.id == 2131230823)
            ios()
        else if (view.id == 2131230824)
            fultter()
        else if (view.id == 2131230825)
            xamarin()
        else if (view.id == 2131230826)
            men()
        Log.i("klkl",view.id.toString())
    }

    private fun men() {
        val intent = Intent(this,MalumotActivity::class.java)
        intent.putExtra("NAME","men")
        startActivity(intent)
    }

    private fun xamarin() {
        val intent = Intent(this,MalumotActivity::class.java)
        intent.putExtra("NAME","xamarin")
        startActivity(intent)
    }

    private fun fultter() {
        val intent = Intent(this,MalumotActivity::class.java)
        intent.putExtra("NAME","fultter")
        startActivity(intent)
    }

    private fun ios() {
        val intent = Intent(this,MalumotActivity::class.java)
        intent.putExtra("NAME","ios")
        startActivity(intent)
    }

    private fun android() {
        val intent = Intent(this,MalumotActivity::class.java)
        intent.putExtra("NAME","android")
        startActivity(intent)
    }
}