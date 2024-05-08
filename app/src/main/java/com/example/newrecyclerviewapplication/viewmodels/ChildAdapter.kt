package com.example.newrecyclerviewapplication.viewmodels

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newrecyclerviewapplication.MainActivity
import com.example.newrecyclerviewapplication.R
import com.example.newrecyclerviewapplication.model.ChildItemDataClass
import com.example.newrecyclerviewapplication.model.ParentItem
import com.squareup.picasso.Picasso

class ChildAdapter(private val childList: List<ChildItemDataClass>) :
    RecyclerView.Adapter<ChildAdapter.ViewHolder>() {


    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val childtextView: TextView = itemView.findViewById(R.id.childtextview)
        val childImage: ImageView = itemView.findViewById(R.id.child_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildAdapter.ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.child_card_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = childList[position]

        holder.childtextView.text = currentItem.description




//        Glide.with(Activity()).load(currentItem.image).into(holder.childImage)

        Picasso.get().load(currentItem.image).into(holder.childImage)

    }



    override fun getItemCount(): Int {
        return childList.size
    }


}