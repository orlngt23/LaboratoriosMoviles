package com.example.laboratorio_07.ui.movie.billboard.recycleview

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_07.data.model.MovieModel
import com.example.laboratorio_07.generated.callback.OnClickListener

class MovieRecyclerViewAdapter(
    private val clickListener: OnClickListener: (MovieModel)-> Unit
) : RecyclerView.Adapter<MovieRecyclerViewHolder>() {
    private val movies = ArrayList<MovieModel>()
}