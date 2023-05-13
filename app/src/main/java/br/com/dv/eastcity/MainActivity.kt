package br.com.dv.eastcity

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "Welcome to East City!", Toast.LENGTH_SHORT).show()

        val view = TextView(this)
        view.text = "Welcome to East City!"
        view.gravity = Gravity.CENTER

        setContentView(view)
    }

}
