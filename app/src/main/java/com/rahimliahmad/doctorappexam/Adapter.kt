package com.rahimliahmad.doctorappexam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter( val context:Context, val imageList : List<Int>, val textList: List<String>,
          val ratelist: List<String>,val speciallist :List<Int>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.docName)
        var profil = itemView.findViewById<ImageView>(R.id.profil)
        var located= itemView.findViewById<TextView>(R.id.place)
        var openbtn= itemView.findViewById<Button>(R.id.openbtn)
        var speciality=itemView.findViewById<TextView>(R.id.speciality)
        var rate= itemView.findViewById<ImageView>(R.id.rate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycle_item,parent,false))
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.setText(textList[position])
        holder.name.setText(textList[position])
        holder.located.setText(textList[position])
        holder.profil.setImageResource(imageList[position])
        holder.rate.setImageResource(imageList[position])
        holder.speciality.setText(textList[position])


    }
}