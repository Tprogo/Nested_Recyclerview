package com.example.newrecyclerviewapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newrecyclerviewapplication.R
import com.example.newrecyclerviewapplication.databinding.FragmentIndianaJonesBinding
import com.squareup.picasso.Picasso


class IndianaJonesFragment : Fragment() {
    private var _binding: FragmentIndianaJonesBinding? = null
    val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIndianaJonesBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

Picasso.get().load("https://image.tmdb.org/t/p/original/e7zyDWXrpXvSuc01m3HdreUlB0y.jpg")
    .into(binding?.indianaJonesImageView)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}