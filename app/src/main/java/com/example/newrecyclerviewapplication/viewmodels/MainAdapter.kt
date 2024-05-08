package com.example.newrecyclerviewapplication.viewmodels

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.newrecyclerviewapplication.R
import com.example.newrecyclerviewapplication.model.ParentItem

class MainAdapter :
    ListAdapter<ParentItem, MainAdapter.ViewHolder>(DiffCallback()) {


    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val maintextView: TextView = itemView.findViewById(R.id.main_text_view)

        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.child_recycler_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_card_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
//        val currentItem = mainList[position]

        val itemView = getItem(position)


        // sets the text to the textview from our itemHolder class
        holder.maintextView.text = itemView.title
//
        val childAdapter = ChildAdapter(itemView.childItem)

        val childLayoutManager = LinearLayoutManager(holder.childRecyclerView.context)
        childLayoutManager.orientation = LinearLayoutManager.HORIZONTAL

        holder.childRecyclerView.setHasFixedSize(true)

        holder.childRecyclerView.layoutManager = childLayoutManager

        holder.childRecyclerView.adapter = childAdapter

    }

//    override fun getItemCount(): Int {
//        return mainList.size
//    }


}