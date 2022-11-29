package ussdcode.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ussdcode.Adapter.MinutAdapter
import ussdcode.Models.MinutModel
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.fragment_minut.view.*

class MinutFragment : Fragment() {
    lateinit var root:View
    lateinit var adapter: MinutAdapter
    lateinit var list: ArrayList<MinutModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_minut, container, false)

        list = ArrayList()

        list.add(MinutModel("60 daqiqa", "*103*60#", "To'plamga kiritilgan daqiqalar 60 daqiqa"))
        list.add(MinutModel("120 daqiqa", "*103*120#", "To'plamga kiritilgan daqiqalar 120 daqiqa"))
        list.add(MinutModel("180 daqiqa", "*103*180#", "To'plamga kiritilgan daqiqalar 180 daqiqa"))

        adapter = MinutAdapter(root.context, list)

        root.minutesRecyclerView.adapter = adapter


        return root
    }
}