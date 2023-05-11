package com.example.myapplication.service

import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.myapplication.model.CatPicture

class CatPictureApiService : CatPictureService {
    private val catUrl: String = "https://cataas.com/cat"
    private val catSaysTextUrl = "https://cataas.com/cat/says/"

    override fun getCatRandomPicture(): CatPicture {
        return CatPicture(catUrl)
    }

    override fun getCatRandomPictureWithText(text: String?) : CatPicture {
        if (text == null || text == "") {
            return CatPicture(catUrl)
        }
        val url = catSaysTextUrl + text
        return CatPicture(url, text)
    }

    override fun loadImage(activity: ComponentActivity, imageView: ImageView, text: String?) {
        val url: String = getCatRandomPictureWithText(text).url
        loadImageWithGlide(activity, imageView, url)
    }

    override fun loadImage(activity: ComponentActivity, imageView: ImageView) {
        val url: String = getCatRandomPicture().url
        loadImageWithGlide(activity, imageView, url)
    }

    private fun loadImageWithGlide(activity: ComponentActivity, imageView: ImageView, url: String) {
        Glide.with(activity)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .placeholder(imageView.drawable)
            .into(imageView)
    }
}
