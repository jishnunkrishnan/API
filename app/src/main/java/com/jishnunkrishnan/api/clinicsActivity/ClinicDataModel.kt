package com.jishnunkrishnan.api.clinicsActivity

data class ClinicDataModel(
	val clinics: List<ClinicsItem?>? = null,
	val count: Int? = null,
	val status: String? = null
)

data class ServiceInfoItem(
	val serviceId: String? = null,
	val name: String? = null
)

data class ClinicsItem(
	val image: String? = null,
	val jsonMember24hour: String? = null,
	val name: String? = null,
	val rating: String? = null,
	val serviceInfo: List<ServiceInfoItem?>? = null,
	val location: String? = null,
	val favourite: String? = null,
	val clinicId: String? = null
)

