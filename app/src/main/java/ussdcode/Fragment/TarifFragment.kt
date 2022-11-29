package ussdcode.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ussdcode.Adapter.TarifAdapter
import ussdcode.Models.TarifModel
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.fragment_tarif.view.*


class TarifFragment : Fragment() {

    lateinit var root: View
    lateinit var adapter: TarifAdapter
    lateinit var list: ArrayList<TarifModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_tarif, container, false)

        list = ArrayList()

        list.add(TarifModel("Mobi 20", "*111*120#", "20000/1000 sum monthly"))
        list.add(TarifModel("Mobi 30", "*111*128#", "30000/1000 sum monthly"))
        list.add(TarifModel("Mobi 40", "*111*121#", "40000/1000 sum monthly"))

        adapter = TarifAdapter(root.context, list)

        root.tariffsRecyclerView.adapter = adapter

        return root
    }
}