package com.jishnunkrishnan.api.clinicsActivity

interface ClinicView {

    fun clinicFetchData(response: ClinicDataModel)
    fun clinicFetchFailed(exception: String)
}