package com.example.bottomsheet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter( private var mList:ArrayList<String>):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.list_item2, parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item.text=mList[position]
    }

    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val item:TextView=ItemView.findViewById(R.id.tvItem)
    }



}