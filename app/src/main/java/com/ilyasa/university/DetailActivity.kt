package com.ilyasa.university

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.appbar.CollapsingToolbarLayout
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_AKREDITASI = "extra_akreditasi"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_LOGO = "extra_logo"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val imglogo: ImageView = findViewById(R.id.img_logo)

        val photoLogo = intent.getIntExtra(EXTRA_LOGO, 0)

        Glide.with(this)
            .load(photoLogo)
            .into(imglogo)


        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvAddress: TextView = findViewById(R.id.tv_item_address)
        val tvAkreditasi: TextView = findViewById(R.id.tv_item_akreditasi)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = findViewById(R.id.image_university)


        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val name = intent.getStringExtra(EXTRA_NAME)
        val akreditasi = intent.getStringExtra(EXTRA_AKREDITASI)
        val address = intent.getStringExtra(EXTRA_ADDRESS)

        tvName.text = name
        tvAddress.text = address
        tvAkreditasi.text = "Akreditasi : $akreditasi"
        tvDetail.text = detail


        val imgUniversity = intent.getIntExtra(EXTRA_PHOTO, 0)
        Glide.with(this)
            .load(imgUniversity)
            .into(imgPhoto)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val toolbar_layout: CollapsingToolbarLayout = findViewById(R.id.collapsing_toolbar)
        toolbar_layout.setTitle("$name");
        toolbar_layout.setCollapsedTitleTextColor(
            ContextCompat.getColor(this, R.color.white)
        );
        toolbar_layout.setExpandedTitleColor(Color.TRANSPARENT)


    }

}