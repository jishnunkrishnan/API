package com.jishnunkrishnan.api.clinicsActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.jishnunkrishnan.api.R
import kotlinx.android.synthetic.main.activity_main.*

class ClinicActivity : AppCompatActivity(), ClinicView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Clinics"

        ClinicPresenter(this, this).loadClinicData()
    }

    override fun clinicFetchData(response: ClinicDataModel) {

        val adapter = ClinicAdapter(response, this)
        rvClinic.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvClinic.setHasFixedSize(true)
        rvClinic.adapter = adapter
        Log.i("rrr", response.toString())
    }

    override fun clinicFetchFailed(exception: String) {

        Toast.makeText(this, "Unable to fetch data", Toast.LENGTH_SHORT).show()
    }
}