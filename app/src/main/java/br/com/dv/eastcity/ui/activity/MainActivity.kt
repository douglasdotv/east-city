package br.com.dv.eastcity.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.dv.eastcity.R
import br.com.dv.eastcity.model.Car
import br.com.dv.eastcity.ui.adapter.CarListAdapter
import br.com.dv.eastcity.databinding.ActivityMainBinding
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvCars.apply {
            adapter = CarListAdapter(cars = listOf(
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
        }

        Toast.makeText(this, R.string.welcome_message, Toast.LENGTH_SHORT).show()
    }
}
