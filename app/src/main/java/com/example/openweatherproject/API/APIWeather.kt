package com.example.openweatherproject.API

import com.example.openweatherproject.model.MainWeather
import retrofit2.Call
import retrofit2.http.GET

interface APIWeather {
    @GET("endpoint_path")
    fun getYourData(): Call<MainWeather?>?
}