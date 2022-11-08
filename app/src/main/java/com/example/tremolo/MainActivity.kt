package com.example.tremolo

import android.content.Intent
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

        cardViewBandAdapter.setOnItemClickCallback(object :
            CardViewBandAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Band) {
                val moveToDetail = Intent(applicationContext, DetailActivity::class.java)
                moveToDetail.putExtra(DetailActivity.EXTRA_NAME, data.name)
                moveToDetail.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
                moveToDetail.putExtra(DetailActivity.EXTRA_PHOTO, data.photo)
                moveToDetail.putExtra(DetailActivity.EXTRA_GENRE, data.genre)
                moveToDetail.putExtra(DetailActivity.EXTRA_LABEL, data.label)
                moveToDetail.putExtra(DetailActivity.EXTRA_YEAR_ACTIVE, data.yearActive)
                startActivity(moveToDetail)
            }
        })
    }
}