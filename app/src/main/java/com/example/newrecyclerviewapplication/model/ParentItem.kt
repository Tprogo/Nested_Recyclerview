package com.example.newrecyclerviewapplication.model

data class ParentItem(val id: Int, val title: String, val childItem: List<ChildItemDataClass> )


data class ChildItemDataClass(val image: String, val description: String)
