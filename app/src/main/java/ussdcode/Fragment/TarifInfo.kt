package ussdcode.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.fragment_tarif_info.view.*

class TarifInfo : Fragment() {

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_tarif_info, container, false)

        var name = arguments?.getString("keyName")
        var desc = arguments?.getString("keyDesc")

        root.tarifNameInfo.text = name
        root.tarifDescInfo.text = desc

        return root
    }
}