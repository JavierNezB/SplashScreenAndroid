package javier.jc.splahsscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.AppTheme)
        //Tardar en mostrar, NUNCA HACER.
        Thread.sleep(1000)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}