package com.example.myworkoutapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myworkoutapp.databinding.ItemExerciseStatusBinding

class ExerciseStatusAdapter(val listExercise:ArrayList<Exercise>):
    RecyclerView.Adapter<ExerciseStatusAdapter.ViewHolder>(){

        inner class ViewHolder(binding:ItemExerciseStatusBinding):RecyclerView.ViewHolder(binding.root){
            val tvItem=binding.tvItem
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemExerciseStatusBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: Exercise=listExercise[position]
        holder.tvItem.text=model.getId().toString()

        when{
            model.getSelected()->{
                holder.tvItem.background=ContextCompat.getDrawable(holder.itemView.context,R.drawable.item_circular_thin_color_accent_border)
                holder.tvItem.setTextColor(Color.parseColor("#87ceeb"))
            }
            model.getCompleted()->{
                holder.tvItem.background=ContextCompat.getDrawable(holder.itemView.context,R.drawable.item_circular_color_accent_background)
                holder.tvItem.setTextColor(Color.parseColor("#FFFFFF"))
            }else->{
            holder.tvItem.background=ContextCompat.getDrawable(holder.itemView.context,R.drawable.item_circular_color_gray_background)
            holder.tvItem.setTextColor(Color.parseColor("#87ceeb"))
            }
        }
    }

    override fun getItemCount(): Int {
        return listExercise.size
    }
}