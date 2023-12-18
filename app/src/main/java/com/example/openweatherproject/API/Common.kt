package com.example.openweatherproject.API

object Common
{
    private val BASE_URL = "ipinfo.io/62.212.64.18?token=3e67cc42055e79"
    val retrofitService: APIWeather
        get() = RetrofitClient.getClient(BASE_URL).create(APIWeather::class.java)
}