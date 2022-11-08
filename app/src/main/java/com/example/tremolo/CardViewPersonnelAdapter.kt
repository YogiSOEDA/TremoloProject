package com.example.tremolo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewPersonnelAdapter(private val listPersonnel: ArrayList<Personnel>, private val indexPersonnel: Int) : RecyclerView.Adapter<CardViewPersonnelAdapter.CardViewPersonnelHolder>(){
    inner class CardViewPersonnelHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPersonnel: ImageView = itemView.findViewById(R.id.img_personnel_photo)
        var tvPersonnel: TextView = itemView.findViewById(R.id.tv_personnel_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewPersonnelHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_peronnel, parent, false)
        return CardViewPersonnelHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewPersonnelHolder, position: Int) {
        val personnel = listPersonnel[position]

        holder.tvPersonnel.text = personnel.name

        Glide.with(holder.itemView.context)
            .load(personnel.photo)
            .into(holder.imgPersonnel)
    }

    override fun getItemCount(): Int {
        return listPersonnel.size
    }
}