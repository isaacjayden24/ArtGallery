package com.example.artgallery.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.artgallery.R
import com.example.artgallery.const.Layout.GRID
import com.example.artgallery.data.DataSource

class ArtGalleryAdapter (private val context?,private val layout:Int)
    :RecyclerView.Adapter<ArtGalleryAdapter.ViewHolder>{
    //include all the three methods in this class
   val artList=DataSource.art
    //inflate the layouts with the relevant layout file
    override  fun onCreateViewHolder(parent:ViewGroup,viewType:Int):ViewHolder{
        val layoutDisplay=when(layout){
            GRID->LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,parent,false)
            else->LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item,
                parent,false)
        }
        return(layoutDisplay)

    }
//binding UI elements to the view holder using position
    override fun onBindViewHolder(holder:ViewHolder,position:Int){
        val get_position=artList[position]
       holder.artImageView?.setImageResource(get_position.imageResourceId)
       holder.artNameTextView?.text=get_position.title
       val resources=context?.resources
     holder.artYearTextView?.text=resources?.getString(R.string.art_year,get_position.year)
    holder.artCountryTextView?.text=resources?.getString(R.string.art_country,get_position.country)



    }

    //return the size of the items
   override  fun getItemCount(){
       return artList.size
    }

    //declare all the UI elements ie name,year,country
    class ViewHolder(view:View?):RecyclerView.ViewHolder(view!!){
        val artImageView:ImageView?=view!!.findViewById(R.id.art_image)
        val artNameTextView:TextView?=view!!.findViewById(R.id.art_name)
        val artYearTextView:TextView?=view!!.findViewById(R.id.art_year)
        val artCountryTextView:TextView?=view!!.findViewById(R.id.art_country)
    }




}
