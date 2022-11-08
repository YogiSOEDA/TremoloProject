package com.example.tremolo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewBandAdapter(private val listBand: ArrayList<Band>) : RecyclerView.Adapter<CardViewBandAdapter.CardViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Band)
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_band, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val band = listBand[position]

        Glide.with(holder.itemView.context)
            .load(band.photo)
            .apply(RequestOptions().override(350, 350))
            .into(holder.imgPhoto)

        holder.tvName.text = band.name
        holder.tvDetail.text = band.detail

        holder.btnDetail.setOnClickListener {
            onItemClickCallback.onItemClicked(listBand[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listBand.size
    }
}