package com.example.myapplication.service

import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.example.myapplication.model.CatPicture

interface CatPictureService {
    fun getCatRandomPicture() : CatPicture
    fun getCatRandomPictureWithText(text: String?) : CatPicture
    fun loadImage(activity: ComponentActivity, imageView: ImageView, text: String?)
    fun loadImage(activity: ComponentActivity, imageView: ImageView)
}
