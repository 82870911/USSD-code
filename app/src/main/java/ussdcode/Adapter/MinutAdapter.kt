package ussdcode.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import ussdcode.Models.MinutModel
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.item_minut.view.*

class MinutAdapter (var context: Context, var list: ArrayList<MinutModel>) :
    RecyclerView.Adapter<MinutAdapter.MyViewHolder>() {

    inner class MyViewHolder(var itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun onBind(model: MinutModel, position: Int) {
            itemview.txt_minutes.text = list[position].minutes
            itemview.minutesCode.text = list[position].code
            itemview.minutesDesc.text = list[position].desc

            itemview.setOnClickListener {
                itemview.findNavController()
                    .navigate(R.id.minutInfo, bundleOf("keyMinut" to list[position].minutes, "keyMinutDesc" to list[position].desc) )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_minut, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}