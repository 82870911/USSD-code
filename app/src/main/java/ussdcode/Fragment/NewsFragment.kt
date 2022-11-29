package ussdcode.Fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.fragment_news.view.*

class NewsFragment : Fragment() {
    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_news, container, false)

        root.txtBatafsil1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://corp.mobi.uz/uz/news/2021/23131/"))
            startActivity(intent)
        }
        root.txtBatafsil2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://corp.mobi.uz/uz/news/2021/22883/"))
            startActivity(intent)
        }
        root.txtBatafsil3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://corp.mobi.uz/uz/news/2021/22882/"))
            startActivity(intent)
        }

        return root
    }

}