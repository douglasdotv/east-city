package br.com.dv.eastcity.model

import java.math.BigDecimal

data class Car(
    val name: String,
    val description: String,
    val price: BigDecimal
)