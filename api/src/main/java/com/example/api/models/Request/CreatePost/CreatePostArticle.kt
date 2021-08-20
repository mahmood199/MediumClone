package com.example.api.models.Request.CreatePost


import com.example.api.models.Request.Article
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreatePostArticle(
    @Json(name = "article")
    val article: Article
)