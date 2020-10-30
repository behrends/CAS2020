package com.example.cas2020

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val id = arguments?.getInt("itemId")
        val view = inflater.inflate(R.layout.fragment_details, container, false)
        view.findViewById<TextView>(R.id.textView3).text = "ITEM " + id
        return view
    }
}