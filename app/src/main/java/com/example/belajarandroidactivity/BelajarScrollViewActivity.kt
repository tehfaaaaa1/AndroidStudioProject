package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity() {
    var ivBackground: ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)
        ivBackground = findViewById(R.id.ivBg)
        Glide.with(this)
            .load(R.drawable.german)
            .transform(BlurTransformation(10, 3))
            .into(ivBackground!!)
    }
}