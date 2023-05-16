package br.com.dv.eastcity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarListAdapter(
    private val context: Context,
    private val cars: List<Car>
) : RecyclerView.Adapter<CarListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind (car: Car) {
            val nameView = itemView.findViewById<TextView>(R.id.name)
            nameView.text = car.name
            val descriptionView = itemView.findViewById<TextView>(R.id.description)
            descriptionView.text = car.description
            val priceView = itemView.findViewById<TextView>(R.id.price)
            priceView.text = car.price.toPlainString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.car_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = cars.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val car = cars[position]
        holder.bind(car)
    }

}
