package com.example.laboratorio_07.ui.movie.billboard.recycleview

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_07.data.model.MovieModel
import com.example.laboratorio_07.generated.callback.OnClickListener

class MovieRecyclerViewHolder (private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(movie:MovieModel, clickListener: (MovieModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieCardView.setOnclickListener{
            clickListener(movie)
        }
    }

}
