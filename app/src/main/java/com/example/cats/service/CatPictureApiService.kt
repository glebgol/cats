package com.example.cats.service

import com.example.cats.model.CatPicture

class CatPictureApiService : CatPictureService {
    private val catUrl: String = "https://cataas.com/cat"
    private val catSaysTextUrl = "https://cataas.com/cat/says/"

    override fun getCatRandomPictureWithText(text: String?) : CatPicture {
        if (text == null) {
            return CatPicture(catUrl)
        }
        val url = catSaysTextUrl + text
        return CatPicture(url, text)
    }
}
