package ussdcode.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.fragment_home.view.*


class   HomeFragment : Fragment() {

    private lateinit var root: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        root = inflater.inflate(R.layout.fragment_home, container, false)

        root.tariffs.setOnClickListener{
            root.findNavController().navigate(R.id.tarifFragment)
        }

        root.minutes.setOnClickListener{
            root.findNavController().navigate(R.id.minutFragment)
        }

        root.internet.setOnClickListener {
            root.findNavController().navigate(R.id.internetFragment)
        }
        root.news.setOnClickListener {
            root.findNavController().navigate(R.id.newsFragment)
        }


        return root
    }
}