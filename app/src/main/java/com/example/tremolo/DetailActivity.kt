package com.example.tremolo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_LABEL = "extra_label"
        const val EXTRA_YEAR_ACTIVE = "extra_year_active"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetail: ImageView = findViewById(R.id.img_detail_photo)
        val tvDetailNama: TextView = findViewById(R.id.tv_detail_name)
        val tvDetailGenre: TextView = findViewById(R.id.tv_detail_genre)
        val tvDetailYearActive: TextView = findViewById(R.id.tv_detail_year_active)
        val tvDetailLabel: TextView = findViewById(R.id.tv_detail_label)
        val tvDetailBand: TextView = findViewById(R.id.tv_detail_band)

        val img = intent.getIntExtra(EXTRA_PHOTO,0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val genre = intent.getStringExtra(EXTRA_GENRE)
        val label = intent.getStringExtra(EXTRA_LABEL)
        val yearActive = intent.getStringExtra(EXTRA_YEAR_ACTIVE)

        tvDetailNama.text = name
        tvDetailGenre.text = genre
        tvDetailYearActive.text = yearActive
        tvDetailLabel.text = label
        tvDetailBand.text = detail

        Glide.with(this)
            .load(img)
            .into(imgDetail)
    }
}