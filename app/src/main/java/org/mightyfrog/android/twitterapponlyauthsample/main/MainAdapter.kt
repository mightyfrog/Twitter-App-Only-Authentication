package org.mightyfrog.android.twitterapponlyauthsample.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.mightyfrog.android.twitterapponlyauthsample.R
import org.mightyfrog.android.twitterapponlyauthsample.data.search.Status

/**
 * @author Shigehiro Soejima
 */
class MainAdapter(var list: List<Status> = emptyList()) : RecyclerView.Adapter<MainAdapter.TweetViewHolder>() {

    override fun getItemCount() = list.size

    override fun getItemId(position: Int) = list[position].id

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.TweetViewHolder =
            TweetViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.vh_main_tweet, parent, false))

    override fun onBindViewHolder(holder: MainAdapter.TweetViewHolder, position: Int) =
            holder.bind(list[position])

    inner class TweetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView = itemView.findViewById<TextView>(R.id.textView)

        fun bind(status: Status) {
            textView.text = status.text
        }
    }
}