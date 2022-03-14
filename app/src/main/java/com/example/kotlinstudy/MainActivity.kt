package com.example.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nexacro.NexacroUpdatorActivity

class MainActivity() : NexacroUpdatorActivity() {

    init {
        bootstrapURL = "http://smart.tobesoft.co.kr/17.1/VideoPlayerSample/_android_/start_android.json"
        projectURL = "http://smart.tobesoft.co.kr/17.1/VideoPlayerSample/_android_/"
        startupClass = NexacroActivityExt::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        val intent = intent
        if (intent != null) {
            val bootstrapURL = intent.getStringExtra("bootstrapURL")
            val projectUrl = intent.getStringExtra("projectUrl")
            if (bootstrapURL != null) {
                setBootstrapURL(bootstrapURL)
                projectURL = projectUrl
            }
        }
        super.onCreate(savedInstanceState)
    }

    override fun setContentView(view: View?) {
        super.setContentView(view)
    }
}