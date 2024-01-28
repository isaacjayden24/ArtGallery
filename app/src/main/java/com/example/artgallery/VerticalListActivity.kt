package com.example.artgallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.artgallery.adapter.ArtGalleryAdapter
import com.example.artgallery.const.Layout
import com.example.artgallery.databinding.ActivityVerticalListBinding

class VerticalListActivity:AppCompatActivity(){

    private lateinit var binding:ActivityVerticalListBinding
    override fun onCreate (savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding=ActivityVerticalListActivity.inflate(layoutInflater)
        setContentView(binding.root)
        binding.verticalRecyclerView.adapter=ArtGalleryAdapter(
            applicationContext,layout.VERTICAL

        )

    }
}