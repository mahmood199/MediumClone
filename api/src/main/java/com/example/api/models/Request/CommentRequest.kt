package com.example.api.models.Request


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommentRequest(
    @Json(name = "comment")
    val comment: Comment
)