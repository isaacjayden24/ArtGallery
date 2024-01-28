package com.example.artgallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.artgallery.adapter.ArtGalleryAdapter
import com.example.artgallery.const.Layout
import com.example.artgallery.databinding.ActivityGridListBinding

class GridListActivity:AppCompatActivity(){

    private lateinit var binding:ActivityGridListBinding
    override fun onCreate (savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding=GridListActivity.inflate(layoutInflater)
        setContentView(binding.root)
        binding.gridRecyclerView.adapter=ArtGalleryAdapter(
            applicationContext,layout.GRID

        )

    }
}