package com.example.newrecyclerviewapplication.viewmodels

import androidx.recyclerview.widget.DiffUtil
import com.example.newrecyclerviewapplication.model.ParentItem

class DiffCallback : DiffUtil.ItemCallback<ParentItem>() {
    override fun areItemsTheSame(oldItem: ParentItem, newItem: ParentItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ParentItem, newItem: ParentItem): Boolean {
        return oldItem == newItem
    }
}