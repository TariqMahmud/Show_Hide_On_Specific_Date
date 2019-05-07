package com.example.test34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showhide.setOnClickListener {

            val today = Calendar.getInstance()
            val dayOfMonth = today.get(Calendar.DAY_OF_MONTH)
            val month = today.get(Calendar.MONTH)
            val year = today.get(Calendar.YEAR)
            if (month == Calendar.MAY && dayOfMonth == 8 && year == 2019) {
                // June 29, 2014
                showhide.setEnabled(true)
                showhide.visibility= View.VISIBLE;
                Toast.makeText(this,"Enable",Toast.LENGTH_LONG).show();
            } else {
                // NOT June 29, 2014
                showhide.setEnabled(false)
                showhide.visibility= View.INVISIBLE;
                Toast.makeText(this,"Disable",Toast.LENGTH_LONG).show();
            }
        }
    }
}