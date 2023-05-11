package com.example.cats

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.bumptech.glide.Glide
import com.example.myapplication.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val imageView: ImageView = findViewById(R.id.imageView);
        Glide.with(this).load("https://goo.gl/gEgYUd").into(imageView);
    }
}
