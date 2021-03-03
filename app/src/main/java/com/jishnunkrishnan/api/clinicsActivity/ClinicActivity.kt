package com.jishnunkrishnan.api.clinicsActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jishnunkrishnan.api.R

class ClinicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Clinics"
    }
}