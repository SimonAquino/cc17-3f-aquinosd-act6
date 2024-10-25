package com.example.catbreedapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysapp.CatBreed
import com.example.a30daysapp.R

class CatBreedAdapter(private val breeds: List<CatBreed>) : RecyclerView.Adapter<CatBreedAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dayIndicator: TextView = view.findViewById(R.id.dayIndicator)
        val breedName: TextView = view.findViewById(R.id.breedName)
        val breedImage: ImageView = view.findViewById(R.id.breedImage)
        val breedDescription: TextView = view.findViewById(R.id.breedDescription)
        val catTips: TextView = view.findViewById(R.id.catTips)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cat_breed, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val breed = breeds[position]
        holder.dayIndicator.text = "Day ${breed.day}"
        holder.breedName.text = breed.name
        holder.breedImage.setImageResource(breed.imageResId)
        holder.breedDescription.text = breed.description
        holder.catTips.text = breed.tips
    }

    override fun getItemCount() = breeds.size
}
