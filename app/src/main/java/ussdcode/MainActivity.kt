package ussdcode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import developer.bekzod.ussdcode.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun navigateUpTo(upIntent: Intent?): Boolean {
        return Navigation.findNavController(this, R.id.navHost).navigateUp()
    }
}
