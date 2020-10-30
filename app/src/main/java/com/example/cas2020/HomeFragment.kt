package com.example.cas2020

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val detailsButton1 = view.findViewById<Button>(R.id.details1)
        detailsButton1.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment2)
        }
        val detailsButton2 = view.findViewById<Button>(R.id.details2)
        detailsButton2.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment2)
        }
        return view
    }
}