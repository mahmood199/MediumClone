package com.example.api.models.Request.UpdateUser


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdateUserRequest(
    @Json(name = "user")
    val user: User
)