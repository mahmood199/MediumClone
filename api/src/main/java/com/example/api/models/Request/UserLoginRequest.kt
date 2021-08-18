package com.example.api.models.Request


import com.example.api.models.Entities.UserDetails
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserLoginRequest(
    @Json(name = "user")
    val user: UserDetails
)