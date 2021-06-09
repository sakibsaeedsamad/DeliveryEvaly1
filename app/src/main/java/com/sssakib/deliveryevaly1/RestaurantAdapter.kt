package com.sssakib.deliveryevaly1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_list.view.*

class RestaurantAdapter: RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {


    private val restaurantTitle = arrayOf("Royal Biriyani and Grill Kabab...",
        "Mithai West Jatrabari Dhaka", "Dhaka Kabab House", "Boba Biriyani")

    private val restaurantReview = arrayOf("3.88","4.35","4.25","4.50")

    private val restaurantImages = intArrayOf(R.drawable.biriyani,
        R.drawable.mithai, R.drawable.kabab,
        R.drawable.boba_biriyani)

    private val restaurantDescription = arrayOf("767m away | ৳40 delivery | Naan . Kebab . Chick..", "779m away | ৳40 delivery | Beef . Sandwiches & ...","750m away | ৳40 delivery | Naan . Kebab . Chick...","867m away | ৳40 delivery | Biriyani . Kebab . Polao &...")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_list, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return restaurantTitle.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.textViewTitle.text = restaurantTitle[position]
        holder.itemView.tvReview.text = restaurantReview[position]
        holder.itemView.tvDescription.text = restaurantDescription[position]
        holder.itemView.imageView.setImageResource(restaurantImages[position])
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}