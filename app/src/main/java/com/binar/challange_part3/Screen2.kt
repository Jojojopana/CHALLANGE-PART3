package com.binar.challange_part3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class Screen2 : Fragment() {
    private lateinit var nameTextView: TextView
//    private lateinit var navigateToThirdScreen: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        navigateToThirdScreen = view.findViewById(R.id.navigate_to_screen3)
        nameTextView = view.findViewById(R.id.nama)

        val button = view.findViewById<Button>(R.id.navigate_to_screen3)
        button.setOnClickListener{

            val screen3 = Screen3()
//            val fragmentManager = parentFragmentManager
            val bundle = Bundle()
            bundle.putString("nama",nameTextView.text.toString())
            screen3.arguments =bundle
            findNavController().navigate(R.id.action_screen2_to_screen3)

//            fragmentManager.beginTransaction().apply {
//                replace(R.id.frame_layout_container, screen3, Screen3::class.java.simpleName)
//                addToBackStack("Screen2")
//                commit()
//            }
        }
    }
}