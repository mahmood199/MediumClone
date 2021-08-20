package com.example.api.models.Request.LoginUser


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginUserRequest(
    @Json(name = "user")
    val user: User
)