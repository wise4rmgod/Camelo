package com.dev.camelo.repository

import com.dev.camelo.api.ApiHelper

class UserAPI(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}