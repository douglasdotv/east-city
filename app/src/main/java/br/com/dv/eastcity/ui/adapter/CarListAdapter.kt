package br.com.dv.eastcity.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.dv.eastcity.model.Car
import br.com.dv.eastcity.databinding.ItemCarBinding

class CarListAdapter(
    private var cars: List<Car>
) : RecyclerView.Adapter<CarListAdapter.CarViewHolder>() {

    inner class CarViewHolder(
        private val binding: ItemCarBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(car: Car) {
            binding.apply {
                tvName.text = car.name
                tvDescription.text = car.description
                tvPrice.text = car.price.toPlainString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCarBinding.inflate(layoutInflater, parent, false)
        return CarViewHolder(binding)
    }

    override fun getItemCount(): Int = cars.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(cars[position])
    }

    fun updateCars(newCars: List<Car>) {
        cars = newCars
        notifyDataSetChanged() // DiffUtil can be used here
    }

}
