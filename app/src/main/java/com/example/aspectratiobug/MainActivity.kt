package com.example.aspectratiobug

import android.graphics.drawable.PictureDrawable
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val requestBuilder = GlideApp.with(this)
            .`as`(PictureDrawable::class.java)
            .transition(withCrossFade())
        requestBuilder.load(Uri.parse("https://gist.githubusercontent.com/DavidCorrado/0ded0eecdd98195e0ae82b62b298eedb/raw/5aa6b73968c0c4100fabb0c8c0bb77ff60932681/response.svg")).into(findViewById(R.id.articleHeaderImage))
    }
}