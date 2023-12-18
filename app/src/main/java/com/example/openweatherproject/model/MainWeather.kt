package com.example.openweatherproject.model

import com.google.gson.annotations.SerializedName

data class MainWeather(
    val ip: String,
    val hostname: String,
    val city: String,
    val region: String,
    val country: String,
    val loc: String,
    val org: String,
    val postal: String,
    val timezone: String
)