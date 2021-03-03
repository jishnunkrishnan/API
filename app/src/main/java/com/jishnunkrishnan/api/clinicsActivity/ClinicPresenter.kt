package com.jishnunkrishnan.api.clinicsActivity

import android.content.Context
import android.widget.Toast
import com.jishnunkrishnan.api.clinicsActivity.services.ApiService
import com.jishnunkrishnan.api.clinicsActivity.services.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ClinicPresenter(private val clinicView: ClinicView, private val context: Context) {

    fun loadClinicData() {

        val apiService = RetrofitClient.buildService(ApiService::class.java)
        val request = apiService.loadClinicData()
        request.enqueue(object : Callback<ClinicDataModel> {

            val exception = "Unable to fetch data"
            override fun onResponse(call: Call<ClinicDataModel>, response: Response<ClinicDataModel>) {
                if (response.isSuccessful) {

                    val clinicData = response.body()
                    clinicView.clinicFetchData(clinicData!!)
                } else {

                    clinicView.clinicFetchFailed(exception)
                }
            }

            override fun onFailure(call: Call<ClinicDataModel>, t: Throwable) {

                clinicView.clinicFetchFailed(exception)
            }
        })
    }
}