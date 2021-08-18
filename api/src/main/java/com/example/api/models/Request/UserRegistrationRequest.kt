package com.example.api.models.Request


import com.example.api.models.Entities.UserRegister
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserRegistrationRequest(
    @Json(name = "user")
    val user: UserRegister
)