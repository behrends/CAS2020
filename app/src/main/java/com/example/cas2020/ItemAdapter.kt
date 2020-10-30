package com.example.cas2020

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private var data = mutableListOf<String>("Eins", "Zwei", "Drei", "Vier", "Fünf")

    inner class ItemViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_item, parent, false) as TextView;
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textView.text = data[position]
        holder.textView.setOnClickListener {view ->
            val bundle = bundleOf("itemId" to position)
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment2, bundle)
        }
    }

    override fun getItemCount() = data.size
}