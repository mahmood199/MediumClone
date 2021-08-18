package com.example.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TagListResponse(
    @Json(name = "tags")
    val tags: List<String>
)