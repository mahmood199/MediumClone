package com.example.api.models.Request.UpdateUser


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//CAn include username and password


@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "bio")
    val bio: String,
    @Json(name = "email")
    val email: String,
    @Json(name = "image")
    val image: String,
    @Json(name = "username")
    val username: String,
    @Json(name = "password")
    val password: String
)