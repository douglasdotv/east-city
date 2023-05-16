package br.com.dv.eastcity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, R.string.welcome_message, Toast.LENGTH_SHORT).show()

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = CarListAdapter(context = this, cars = listOf(
            Car(
                name = "Mazda RX-7",
                description = "Mazda RX-7 Type RS-R",
                price = BigDecimal("27737")
            ),
            Car(
                name = "Fusca",
                description = "Fusca 1972",
                price = BigDecimal("10000")
            ),
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}
