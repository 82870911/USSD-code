package ussdcode.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import ussdcode.Models.TarifModel
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.item_tarif.view.*

class TarifAdapter (var context: Context, var list: ArrayList<TarifModel>) :
    RecyclerView.Adapter<TarifAdapter.MyViewHolder>() {
    inner class MyViewHolder(var itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun onBind(model: TarifModel, position: Int) {
            itemview.tariffName.text = list[position].name
            itemview.tariffCode.text = list[position].code
            itemview.tariffDesc.text = list[position].desc

            itemview.setOnClickListener {
                itemview.findNavController().navigate(R.id.tarifInfo, bundleOf("keyName" to list[position].name, "keyDesc" to list[position].desc))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_tarif, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}