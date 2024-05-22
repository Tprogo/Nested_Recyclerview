package com.example.newrecyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

 open class MainActivity : AppCompatActivity() {

     private var backPressCount = 0
     private var exitApp = 0
     private lateinit var navHostFragment: NavHostFragment
     private lateinit var navController: NavController

     private lateinit var bottomNavigationView: BottomNavigationView
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         bottomNavigationView = findViewById(R.id.bottomNavigationView)


          navHostFragment =
             supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
          navController = navHostFragment.navController
         val navView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

         navView.setupWithNavController(navController)

         val toolbarOne: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)


         // use R.id.homeFragment if you want home fragment as home
         // otherwise use navcontroller.graph


         val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment))
             
//         val appBarConfiguration = AppBarConfiguration(navController.graph)

         toolbarOne.setupWithNavController(navController, appBarConfiguration)


         // avoid displaying bottom navigation on the splash fragment
         // using navController.addOnDestinationChangedListener

         navController.addOnDestinationChangedListener { controller, destination, arguments ->

                when (destination.id) {
                    R.id.splashFragment -> {
                        navView.visibility = View.GONE // Hide for splash fragment
                        toolbarOne.visibility = View.GONE
                    }  // hide toolbar for splash fragment
                    else -> {
                        navView.visibility = View.VISIBLE // Show for other destinations
                        toolbarOne.visibility = View.VISIBLE
                    }
                }




             if (navController.currentDestination?.id == R.id.homeFragment) {
                 // Reset back press count when reaching home fragment
                 backPressCount = 0 }

             Log.d("TAG BackpressCount","Backpresscount = $backPressCount")


         }



//

         // set the titles of a fragments using lables in nav graph

         // this function also can be used to hide the bottom navigation
         // you have to set the class open
         // use this function in all fragments where you want to control the visibility
         // of bottom navigation view

//      fun setBootomNav(flag: Boolean){
//
//         if (flag){
//             bottomNavigationView.visibility = View.GONE
//         }else{
//             bottomNavigationView.visibility = View.VISIBLE
//         }
//
//    }

         Log.d("Exit App TAG","ExitApp = $exitApp")


     }



     // if back button pressed more than 5 times
     // it will redirect to the home fragment

     override fun onBackPressed() {


         if(navController.currentDestination?.id == R.id.homeFragment){

             // when user at home fragment and press back btn
             // exitApp becomes 1 and shows a toast

             if (exitApp == 0){
                 exitApp++
                 Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show()
             } else {

                 // set again exitApp = 0
                 // exit the app

                 exitApp = 0
                 finish()
             }

         } else {
             if (backPressCount < 5) {
                 // Increment back press count
                 backPressCount++
                 super.onBackPressed()
             } else {
                 // Navigate to home fragment and clear back stack
                 navController.navigate(R.id.homeFragment)
                 backPressCount = 0  // Reset count after forced navigation
             }
         }

     }


 }