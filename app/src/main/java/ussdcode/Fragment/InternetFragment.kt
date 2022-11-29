package ussdcode.Fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ussdcode.Adapter.InternetAdapter
import ussdcode.Adapter.ItemClick
import ussdcode.Models.InternetModel
import developer.bekzod.ussdcode.R
import kotlinx.android.synthetic.main.fragment_internet.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class InternetFragment : Fragment() {  lateinit var root: View
    lateinit var adapteroylik: InternetAdapter
    lateinit var adapterkunlik: InternetAdapter
    lateinit var listoylik: ArrayList<InternetModel>
    lateinit var listkunlik: ArrayList<InternetModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_internet, container, false)

        listoylik = ArrayList()

        listoylik.add(InternetModel("300 mb", "8.000 so'm", "30 kun", "*171*019*1*010300368*1#"))
        listoylik.add(InternetModel("500 mb", "9.000 so'm", "30 kun", "*171*019*7*010300368*1#"))
        listoylik.add(InternetModel("1000 mb", "11.000 so'm", "30 kun", "*171*019*2*010300368*1#"))
        listoylik.add(InternetModel("2000 mb", "17.000 so'm", "30 kun", "*171*019*5*010300368*1#"))
        listoylik.add(InternetModel("3000 mb", "25.000 so'm", "30 kun", "*171*019*3*010300368*1#"))
        listoylik.add(InternetModel("5000 mb", "33.000 so'm", "30 kun", "*171*019*4*010300368*1#"))
        listoylik.add(InternetModel("10 000 mb", "50.000 so'm", "30 kun", "*171*019*6*010300368*1#"))
        listoylik.add(InternetModel("20 000 mb", "55.000 so'm", "30 kun", "*171*019*8*010300368*1#"))
        listoylik.add(InternetModel("30 000 mb", "65.000 so'm", "30 kun", "*171*019*9*010300368*1#"))
        listoylik.add(InternetModel("50 000 mb", "75.000 so'm", "30 kun", "*171*019*10*010300368*1#"))

        listkunlik = ArrayList()

        listkunlik.add(InternetModel("200 mb", "2.000 so'm", "1 kun", "*171*204*200*010300368*1#"))
        listkunlik.add(InternetModel("300 mb", "3.000 so'm", "1 kun", "*171*204*300*010300368*1#"))
        listkunlik.add(InternetModel("500 mb", "4.000 so'm", "1 kun", "*171*204*500*010300368*1#"))
        listkunlik.add(InternetModel("1000 mb", "5.000 so'm", "1 kun", "*171*204*1000*010300368*1#"))
        listkunlik.add(InternetModel("2000 mb", "9.000 so'm", "1 kun", "*171*204*2000*010300368*1#"))
        listkunlik.add(InternetModel("3000 mb", "12.000 so'm", "1 kun", "*171*204*3000*010300368*1#"))
        listkunlik.add(InternetModel("5000 mb", "16.500 so'm", "1 kun", "*171*204*5000*010300368*1#"))
        listkunlik.add(InternetModel("10 000 mb", "16.500 so'm", "1 kun", "*171*204*1000*010300368*1#"))

        adapteroylik = InternetAdapter(root.context, listoylik, object : ItemClick {
            override fun onClick(list: ArrayList<InternetModel>, position: Int) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:${list[position].cod}")
                startActivity(intent)
            }

        })
        root.OylikInternetRecyclerView.adapter = adapteroylik

        adapterkunlik = InternetAdapter(root.context, listkunlik, object : ItemClick {
            override fun onClick(list: ArrayList<InternetModel>, position: Int) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:${list[position].cod}")
                startActivity(intent)
            }

        })

        root.KunlikInternetRecyclerView.adapter = adapterkunlik

        return root
    }

}