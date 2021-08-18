package com.example.api.models.Request


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreatePostArticle(
    @Json(name = "article")
    val article: Article
)