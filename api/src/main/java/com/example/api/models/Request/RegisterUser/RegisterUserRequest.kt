package com.example.api.models.Request.RegisterUser


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RegisterUserRequest(
    @Json(name = "user")
    val user: User
)