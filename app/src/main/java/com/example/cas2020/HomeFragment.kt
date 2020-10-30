package com.example.cas2020

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
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
            val bundle = bundleOf("itemId" to 1)
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment2, bundle)
        }
        val detailsButton2 = view.findViewById<Button>(R.id.details2)
        detailsButton2.setOnClickListener { view: View ->
            val bundle = bundleOf(Pair("itemId", 2))
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment2, bundle)
        }
        return view
    }
}