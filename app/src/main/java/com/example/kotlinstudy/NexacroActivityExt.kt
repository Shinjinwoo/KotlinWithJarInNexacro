package com.example.kotlinstudy

import android.os.Bundle
import com.nexacro.NexacroActivity

class NexacroActivityExt : NexacroActivity() {
    var LOG_TAG = this.javaClass.simpleName

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @Override
    override fun onResume() {
        super.onResume()
    }

    @Override
    override fun onPause() {
        super.onPause()
    }
}