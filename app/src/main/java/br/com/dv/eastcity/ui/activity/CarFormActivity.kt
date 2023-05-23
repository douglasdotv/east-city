package br.com.dv.eastcity.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.dv.eastcity.R
import br.com.dv.eastcity.dao.CarDao
import br.com.dv.eastcity.model.Car
import java.math.BigDecimal

class CarFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_form)

        val saveButton = findViewById<Button>(R.id.btnSave)
        saveButton.setOnClickListener {
            val name = findViewById<EditText>(R.id.etName).text.toString()
            val description = findViewById<EditText>(R.id.etDescription).text.toString()
            val priceString = findViewById<EditText>(R.id.etPrice).text.toString()

            val price = when {
                priceString.isBlank() -> BigDecimal.ZERO
                else -> priceString.toBigDecimal()
            }

            val newCar = Car(
                name = name,
                description = description,
                price = price
            )

            CarDao.add(newCar)
            Log.i("CarFormActivity", "New car: $newCar")

            finish()
        }
    }

}
