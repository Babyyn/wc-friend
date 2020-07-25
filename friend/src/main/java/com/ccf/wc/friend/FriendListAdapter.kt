package com.ccf.wc.friend

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ccf.wc.profile.entity.User
import kotlinx.android.synthetic.main.listitem_friend.view.*

class FriendListAdapter :
    ListAdapter<User, FriendListAdapter.FriendItemHolder>(UserDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendItemHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem_friend, parent, false)
        return FriendItemHolder(view)
    }

    override fun onBindViewHolder(holder: FriendItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class FriendItemHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(user: User) {
            view.user_name.text = user.name
        }
    }

    internal class UserDiffCallback : DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.name == newItem.name
        }
    }
}