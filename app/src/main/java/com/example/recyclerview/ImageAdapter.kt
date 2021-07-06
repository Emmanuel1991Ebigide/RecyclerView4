package com.example.recyclerview

import android.content.Context
import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

class ImageAdapter(public var context: Context, var Image: List<Imageprofile>): RecyclerView.Adapter<ImageViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(LayoutInflater.from(parent.context))
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        var  image = Image.get(position)
        holder.bind(image)
    }

    override fun getItemCount(): Int {
        return Image.size
    }
    inner class ImageViewHolder(var imagebinding:ImageView):RecyclerView.ViewHolder(imagebinding.root){
        fun bind(imageView: ImageView){
            imagebinding.txtfisrtname.text = imageView.firstname
        }
    }
}