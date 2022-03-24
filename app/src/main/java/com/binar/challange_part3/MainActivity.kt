package com.binar.challange_part3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        screen1()
    }

//    private fun screen1() {
//        val fragmentManager: FragmentManager = supportFragmentManager
//        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
//        val screen1 = Screen1()
//        fragmentTransaction.replace(R.id.frame_layout_container, screen1, Screen1::class.java.simpleName)
//        fragmentTransaction.commit()
//    }
}