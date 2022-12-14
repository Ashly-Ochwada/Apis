package com.naburi.myposts

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naburi.myposts.databinding.PostListItemBinding

class PostRVAdapter (var context: Context, var postList: List<Post>): RecyclerView.Adapter<PostRVAdapter.PostViewHolder>(){


    class PostViewHolder(val binding: PostListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var binding = PostListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        var currentPosts = postList.get(position)
        holder.binding.tvUserId.text = currentPosts.userId.toString()
        holder.binding.tvId.text = currentPosts.id.toString()
        holder.binding.tvTitle.text = currentPosts.title
        holder.binding.tvBody.text = currentPosts.body
    }

    override fun getItemCount(): Int {

        return postList.size
    }
}

