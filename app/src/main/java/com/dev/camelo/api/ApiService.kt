package com.dev.camelo.api

import com.dev.camelo.api.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("user")
    suspend fun getUsers(): List<User>

}