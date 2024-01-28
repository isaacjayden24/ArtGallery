package com.example.artgallery.Model

import androidx.annotation.DrawableRes
//A data class to represent the information passed on each art
data class Art (
    @Drawable val imageResourceId:Int,
    val title:String,
    val country:String,
     val year:Int

)