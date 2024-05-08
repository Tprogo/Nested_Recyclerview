package com.example.newrecyclerviewapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newrecyclerviewapplication.R
import com.example.newrecyclerviewapplication.databinding.FragmentDetailBinding
import com.example.newrecyclerviewapplication.databinding.FragmentHomeBinding
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {


    private var _binding: FragmentDetailBinding? = null
    val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        Picasso.get().load("https://www.movieposters.com/cdn/shop/products/ed4796ac6feff9d2a6115406f964c928_6b200bda-fe71-4900-ad7f-903cdda50dab_240x360_crop_center.progressive.jpg?v=1573587596")
            .into(binding?.detailImage)


        return binding!!.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}