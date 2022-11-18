package com.flknlabs.modulesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flknlabs.toaster.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.showToast(this, "Hola")
    }
}