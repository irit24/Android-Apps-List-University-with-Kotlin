package com.ilyasa.university.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ilyasa.university.DetailActivity
import com.ilyasa.university.R
import com.ilyasa.university.University

/**
 * Created by Ilyasa Ridho
on 05,March,2021
 */
class UniversityAdapter(private  val listUniversity : ArrayList<University>) : RecyclerView.Adapter<UniversityAdapter.CardViewViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UniversityAdapter.CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_university,parent,false)
        return  CardViewViewHolder(view)

    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imgLogo : ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvAddress : TextView = itemView.findViewById(R.id.tv_item_address)
        var tvAkreditasi : TextView = itemView.findViewById(R.id.tv_item_akreditasi)







    }

    override fun onBindViewHolder(holder: UniversityAdapter.CardViewViewHolder, position: Int) {
        val  university = listUniversity[position]

        Glide.with(holder.itemView.context)
            .load(university.logo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgLogo)


        holder.tvName.text = university.name
        holder.tvAddress.text = university.address
        holder.tvAkreditasi.text = "Akreditasi :  ${university.akreditasi}"








        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context,listUniversity[holder.adapterPosition].name,
                Toast.LENGTH_SHORT).show()
            val moveWithDataIntent = Intent(holder.itemView.context, DetailActivity::class.java)
            moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, listUniversity[holder.adapterPosition].name)
            moveWithDataIntent.putExtra(DetailActivity.EXTRA_ADDRESS, listUniversity[holder.adapterPosition].address)
            moveWithDataIntent.putExtra(DetailActivity.EXTRA_AKREDITASI, listUniversity[holder.adapterPosition].akreditasi)
            moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, listUniversity[holder.adapterPosition].detail)
            moveWithDataIntent.putExtra(DetailActivity.EXTRA_PHOTO, listUniversity[holder.adapterPosition].photo)
            moveWithDataIntent.putExtra(DetailActivity.EXTRA_LOGO, listUniversity[holder.adapterPosition].logo)


            holder.itemView.context.startActivity(moveWithDataIntent)
        }
    }

    override fun getItemCount(): Int {
        return  listUniversity.size
    }
}