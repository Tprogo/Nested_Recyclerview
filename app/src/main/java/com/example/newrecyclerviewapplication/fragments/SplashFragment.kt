package com.example.newrecyclerviewapplication.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newrecyclerviewapplication.MainActivity
import com.example.newrecyclerviewapplication.R
import com.example.newrecyclerviewapplication.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSplashBinding.inflate(inflater, container,false)





        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //animate text view

        val splashtextanim = AnimationUtils.loadAnimation(requireContext(),R.anim.splashtextanim)
        binding!!.splashtext.startAnimation(splashtextanim)

        //set lottie animation

        binding!!.lottieanim.visibility = View.VISIBLE
        binding!!.lottieanim.playAnimation()

        val activityMain = activity as MainActivity

//        activityMain.setBootomNav(true)





        // more control over lottie animation

//        binding!!.lottieanim.addAnimatorListener(object: Animator.AnimatorListener{
//            override fun onAnimationStart(p0: Animator) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onAnimationEnd(p0: Animator) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onAnimationCancel(p0: Animator) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onAnimationRepeat(p0: Animator) {
//                TODO("Not yet implemented")
//            }
//        })



       // after delay go to the home fragment

        Handler(Looper.getMainLooper()).postDelayed({

        view.post {
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }

        }, 2500)
    }


}