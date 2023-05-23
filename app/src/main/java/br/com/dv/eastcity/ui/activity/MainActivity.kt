package br.com.dv.eastcity.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.dv.eastcity.R
import br.com.dv.eastcity.dao.CarDao
import br.com.dv.eastcity.databinding.ActivityMainBinding
import br.com.dv.eastcity.ui.adapter.CarListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvCars.apply {
            adapter = CarListAdapter(CarDao.findAll())
        }

        binding.floatingActionButton.setOnClickListener {
            Intent(this, CarFormActivity::class.java).apply {
                startActivity(this)
            }
        }

        Toast.makeText(this, R.string.welcome_message, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        (binding.rvCars.adapter as? CarListAdapter)?.updateCars(CarDao.findAll())
    }

}
