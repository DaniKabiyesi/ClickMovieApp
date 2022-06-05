package com.example.myapplication.feature.home.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.QuickMovieResponse
import com.example.myapplication.feature.home.HomeScreenFragment

class HomeClickMovieListAdapter(
    private val movieListListeners: HomeScreenFragment,
    private val context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val quickMovieAdapterList: MutableList<QuickMovieResponse> = mutableListOf()

    override fun getItemCount(): Int {
        return quickMovieAdapterList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }


}