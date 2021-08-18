package com.example.api.models.Request


import com.example.api.models.Entities.Article
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostArticleRequest(
    @Json(name = "article")
    val article: Article
)