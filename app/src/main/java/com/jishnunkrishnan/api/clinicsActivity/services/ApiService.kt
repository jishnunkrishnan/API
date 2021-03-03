package com.jishnunkrishnan.api.clinicsActivity.services

import com.jishnunkrishnan.api.clinicsActivity.ClinicDataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("mobileapi/master/get_clinics?language_id=1&token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoiMTEiLCJpYXQiOjE2MTQ3NjM1ODN9.Tx7kKLAHJd-acDhc8HyrS6g_OaikzaxqKPYPfFYLsik&user_id=11")
    fun loadClinicData(): Call<ClinicDataModel>
}