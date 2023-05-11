package com.example.cats.service

import com.example.cats.model.CatPicture

interface CatPictureService {
    fun getCatRandomPictureWithText(text: String?) : CatPicture
}