package ussdcode.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.fragment_minut_info.view.*

class MinutInfo : Fragment() {
    lateinit var root:View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_minut_info, container, false)

        var name = arguments?.getString("keyMinut")
        var desc = arguments?.getString("keyMinutDesc")


        root.minutNameInfo.text = name
        root.minutDescInfo.text = desc

        return root
    }
}