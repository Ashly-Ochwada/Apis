package com.naburi.myposts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naburi.myposts.databinding.CommentsListItemBinding

class CommentRVAdapter (var commentsList: List<Comment>): RecyclerView.Adapter<CommentsViewHolder>(){


//    class CommentsViewHolder(val binding: CommentsListItemBinding): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentsViewHolder{
        var binding = CommentsListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CommentsViewHolder(binding)

    }

    override fun onBindViewHolder(holder:CommentsViewHolder, position: Int) {
        var currentComment = commentsList.get(position)
        holder.binding.tvPostId.text = currentComment.postId.toString()
        holder.binding.tvId.text = currentComment.id.toString()
        holder.binding.tvName.text = currentComment.name
        holder.binding.tvBody.text = currentComment.body

    }

    override fun getItemCount(): Int {

        return commentsList.size
    }

}

class CommentsViewHolder(val binding: CommentsListItemBinding): RecyclerView.ViewHolder(binding.root)





