package br.com.dv.eastcity.dao

import br.com.dv.eastcity.model.Car

object CarDao {

    private val cars = mutableListOf<Car>()

    fun add(car: Car) {
        cars.add(car)
    }

    fun findAll(): List<Car> {
        return cars.toList()
    }

}
