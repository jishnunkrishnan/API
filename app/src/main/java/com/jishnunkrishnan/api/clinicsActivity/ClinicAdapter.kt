package com.jishnunkrishnan.api.clinicsActivity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jishnunkrishnan.api.R

class ClinicAdapter(private val clinicData: ClinicDataModel, private val context: Context):
    RecyclerView.Adapter<ClinicAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_clinic_list_layout, parent, false))
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        Glide.with(context)
            .load("https://clinics-kw.com/image/" + clinicData.clinics!![position]?.image)
            .into(holder.imageView)

        holder.tvClinicName.text = clinicData.clinics[position]?.name.toString()

        if (clinicData.clinics[position]?.rating.toString() == "") {
            holder.tvStar.text = "0"
        } else {
            holder.tvStar.text = clinicData.clinics[position]?.rating.toString()
        }

        holder.tvLocation.text = clinicData.clinics[position]?.location.toString()

        if (clinicData.clinics[position]?.a24hour.toString() == "0") {
            holder.tvHours.text = "8.00 AM to 6.00 PM"

        } else {
            holder.tvHours.text = "Open 24 Hours"
        }

        var d: String? = ""
        for (i in clinicData.clinics[position]?.service_info!!.indices) {

            val data = clinicData.clinics[position]?.service_info?.get(i)?.name.toString()

            if (i == clinicData.clinics[position]?.service_info?.size!! -1) {
                d =  "$d$data"
            } else {

                d = "$d$data   |   "
            }
            holder.tvServices.text = d
        }

        if (clinicData.clinics[position]?.favourite.toString() == "0") {

            holder.imageViewLove.setImageResource(R.drawable.ic_love)
        } else {
            holder.imageViewLove.setImageResource(R.drawable.ic_loved)
        }

    }

    override fun getItemCount(): Int {

        return clinicData.clinics?.size!!
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imageView: ImageView = itemView.findViewById(R.id.imageView)
        var imageViewLove: ImageView = itemView.findViewById(R.id.ivLove)
        var tvClinicName: TextView = itemView.findViewById(R.id.tvClinicName)
        var tvStar: TextView = itemView.findViewById(R.id.tvStar)
        var tvLocation: TextView = itemView.findViewById(R.id.tvLocation)
        var tvHours: TextView = itemView.findViewById(R.id.tvHours)
        var tvServices: TextView = itemView.findViewById(R.id.tvServices)
    }
}