package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_malumot.*

class MalumotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_malumot)

        val intent = intent

        if (intent.getStringExtra("NAME") == "android") {
            malumot_img.setImageResource(R.drawable.img_1)
            malumot_text.text = getString(R.string.android)
        } else if (intent.getStringExtra("NAME") == "ios") {
            malumot_img.setImageResource(R.drawable.img_2)
            malumot_text.text = getString(R.string.ios)
        } else if (intent.getStringExtra("NAME") == "fultter") {
            malumot_img.setImageResource(R.drawable.img_3)
            malumot_text.text = getString(R.string.fultter)
        } else if (intent.getStringExtra("NAME") == "xamarin") {
            malumot_img.setImageResource(R.drawable.xamarin)
            malumot_text.text = getString(R.string.xamarin)
        } else if (intent.getStringExtra("NAME") == "men") {
            malumot_img.setImageResource(R.drawable.programmer)
            malumot_text.text = getString(R.string.men)

        }
    }
}