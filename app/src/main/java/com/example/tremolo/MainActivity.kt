package com.example.tremolo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvBand: RecyclerView
    private var list: ArrayList<Band> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBand = findViewById(R.id.rv_bands)
        rvBand.setHasFixedSize(true)

        list.addAll(BandData.listData)

        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvBand.layoutManager = LinearLayoutManager(this)
        val cardViewBandAdapter = CardViewBandAdapter(list)
        rvBand.adapter = cardViewBandAdapter
    }
}