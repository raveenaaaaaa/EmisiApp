package com.staysafe.emisiapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class AdaoterRV(private val list:List<Model>): RecyclerView.Adapter<AdaoterRV.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = list[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.judul.text = currentItem.title
        holder.g.setImageResource(currentItem.image2)
        holder.e.text = currentItem.emisi
        holder.j.text = currentItem.b
        holder.t.text =currentItem.tgl
    }

    override fun getItemCount() = list.size


    class ViewHolder(itemView: View) :RecyclerView.ViewHolder (itemView){

        val imageView: ImageView = itemView.findViewById(R.id.imageView7)
        val judul:TextView = itemView.findViewById(R.id.textView24)
        val g:ImageView = itemView.findViewById(R.id.imageView8)
        val e :TextView = itemView.findViewById(R.id.textView26)
        val j:TextView = itemView.findViewById(R.id.textView27)
        val t : TextView = itemView.findViewById(R.id.textView28)

    }
}
