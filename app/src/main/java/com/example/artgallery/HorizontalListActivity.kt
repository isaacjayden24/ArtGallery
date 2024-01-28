package com.example.artgallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.artgallery.adapter.ArtGalleryAdapter
import com.example.artgallery.const.Layout
import com.example.artgallery.databinding.ActivityHorizontalListBinding

class HorizontalListActivity:AppCompatActivity(){

    private lateinit var binding:ActivityHorizontalListBinding
    override fun onCreate (savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding=HorizontalListActivity.inflate(layoutInflater)
        setContentView(binding.root)
        binding.horizontalRecyclerView.adapter=ArtGalleryAdapter(
            applicationContext,layout.HORIZONTAL

        )

    }
}