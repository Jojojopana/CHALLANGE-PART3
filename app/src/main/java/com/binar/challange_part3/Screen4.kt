package com.binar.challange_part3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController

class Screen4 : Fragment() {
    private lateinit var ageTextView: TextView
    private lateinit var alamatTextView: TextView
    private lateinit var pekerjaanTextView: TextView
//    private lateinit var backToScreen3: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataName = arguments?.getString("nama")

        val dataTextView1 = view.findViewById<TextView>(R.id.namascreen4)
        ageTextView = view.findViewById(R.id.usia)
        alamatTextView = view.findViewById(R.id.alamat)
        pekerjaanTextView = view.findViewById(R.id.pekerjaan)
        val button = view.findViewById<Button>(R.id.BackToScreen3)

        dataTextView1.text = dataName

        button.setOnClickListener{
            val fragmentManager: FragmentManager = parentFragmentManager
//            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            val screen3 = Screen3()
            val bundle = Bundle()
            bundle.putString("usia",ageTextView.text.toString())
            bundle.putString("alamat",alamatTextView.text.toString())
            bundle.putString("pekerjaan",pekerjaanTextView.text.toString())
            bundle.putString("nama",dataName.toString())
            screen3.arguments = bundle
            findNavController().navigate(R.id.action_screen4_to_screen3)


//            fragmentTransaction.replace(R.id.frame_layout_container, screen3, Screen3::class.java.simpleName)
//            fragmentTransaction.addToBackStack("Screen4")
//            fragmentTransaction.commit()

        }

    }
}