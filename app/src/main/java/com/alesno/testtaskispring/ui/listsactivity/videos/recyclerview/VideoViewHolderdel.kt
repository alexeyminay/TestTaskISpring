package com.alesno.testtaskispring.ui.listsactivity.videos.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.alesno.testtaskispring.databinding.ItemListMovieBinding
import com.alesno.testtaskispring.model.objectbox.entities.VideoObject
import com.alesno.testtaskispring.ui.videoactivity.VideoActivity

class VideoViewHolderdel(val binding: ItemListMovieBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(video: VideoObject){
        binding.video = video
        binding.executePendingBindings()
    }
}