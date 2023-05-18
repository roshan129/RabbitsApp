package com.roshanadke.rabbitsapp.data

import retrofit2.http.GET

interface RabbitsApi {

    companion object {
        val BASE_URL = "http://192.168.1.4:8080"
    }

    @GET("/random-rabbit")
    suspend fun getRabbit(): Rabbit



}