package com.binar.challange_part3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class Screen3 : Fragment() {
//    private lateinit var navigateToFourthScreen: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        navigateToFourthScreen = view.findViewById(R.id.navigate_to_screen4)
        super.onViewCreated(view, savedInstanceState)

        val dataName = arguments?.getString("nama")
        val dataAge = arguments?.getString("usia")
        val dataAlamat = arguments?.getString("alamat")
        val dataPekerjaan = arguments?.getString("pekerjaan")


        val dataTextView1 = view.findViewById<TextView>(R.id.name_text_view)
        val button = view.findViewById<Button>(R.id.navigate_to_screen4)

        val dataAlamatView = view.findViewById<TextView>(R.id.alamat_text_view)
        val dataPekerjaanView = view.findViewById<TextView>(R.id.pekerjaan_text_view)
        val usia = dataAge?.toInt()
        val gage: String
        if (usia!=null){
            gage = if (usia%2==0){
                "$dataAge, Umur Genap"
            } else{
                "$dataAge, Umur Ganjil"
            }
            val dataAgeView = view.findViewById<TextView>(R.id.age_text_view)
            dataAgeView.text = gage

        }

        dataTextView1.text = dataName
        dataAlamatView.text = dataAlamat
        dataPekerjaanView.text = dataPekerjaan

        button.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nama",dataName.toString())
            val screen4 = Screen4()
//            val fragmentManager = parentFragmentManager
            screen4.arguments =bundle
            findNavController().navigate(R.id.action_screen3_to_screen4)

//            fragmentManager.beginTransaction().apply {
//                replace(R.id.frame_layout_container, screen4, Screen4::class.java.simpleName)
//                addToBackStack("Screen3")
//                commit()
//            }
        }
    }
}