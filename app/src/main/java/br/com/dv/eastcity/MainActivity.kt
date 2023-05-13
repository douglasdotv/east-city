package br.com.dv.eastcity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, R.string.welcome_message, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
    }

}
