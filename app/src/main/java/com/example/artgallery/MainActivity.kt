package com.example.artgallery

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.artgallery.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {


    private lateinit var binding:ActivityMainBinding
    private lateinit var listIntent: Intent
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //declare all the ui elements on click by setting up a on click listener
        binding.horizontalBtn.setOnClickListener{
            horizontalButton()
        }
        binding.verticalBtn.setOnClickListener{
            verticalButton()
        }
        binding.gridBtn.setOnClickListener{
            gridButton()
        }

    }
    //create intents to launch different scrrens when clicked
    private fun gridButton(){
        listIntent=Intent(this,GridListActivity::class.java)
        startActivity(listIntent)
        //this will launch the grid activity screen on click
    }
    private fun horizontalButton(){
        listIntent=Intent(this,HorizontalListActivity::class.java)
        startActivity(listIntent)
        //this will launch the horizontal activity screen on click
    }
    private fun verticalButton(){
        listIntent=Intent(this,VerticalListActivity::class.java)
        startActivity(listIntent)
        //this will launch the vertical activity screen on click
    }

}