package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.example.myapplication.service.CatPictureApiService
import com.example.myapplication.service.CatPictureService

class MainActivity : ComponentActivity() {
    private val catPictureService: CatPictureService = CatPictureApiService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        catPictureService.loadImage(this, imageView)

        val textEdit: EditText = findViewById(R.id.editTextText)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            catPictureService.loadImage(this,
                imageView, textEdit.text.toString())
        }
    }
}
