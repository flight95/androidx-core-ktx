package flight95.core.ktx.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import flight95.core.ktx.example.ktx.widget.appear
import flight95.core.ktx.widget.setDefaultFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        toolbar_image?.setDefaultFactory()

        fab.setOnClickListener {
            Snackbar.make(root, R.string.snackbar_appear, Snackbar.LENGTH_LONG).appear()
        }
    }
}