package com.jishnunkrishnan.api.clinicsActivity

data class ClinicDataModel(
	val clinics: List<ClinicsItem?>? = null,
	val count: Int? = null,
	val status: String? = null
)

data class ServiceInfoItem(
	val service_id: String? = null,
	val name: String? = null
)

data class ClinicsItem(
	val image: String? = null,
	val a24hour: String? = null,
	val name: String? = null,
	val rating: String? = null,
	val service_info: List<ServiceInfoItem?>? = null,
	val location: String? = null,
	val favourite: String? = null,
	val clinic_id: String? = null
)

