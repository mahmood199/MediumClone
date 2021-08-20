package com.example.api.services

import com.example.api.models.Entities.Article
import com.example.api.models.Entities.Profile
import com.example.api.models.Entities.User
import com.example.api.models.Response.MultipleCommentsResponse
import com.example.api.models.Request.Comment
import com.example.api.models.Request.CreatePost.CreatePostArticle
import com.example.api.models.Request.LoginUser.LoginUserRequest
import com.example.api.models.Request.RegisterUser.RegisterUserRequest
import com.example.api.models.Response.ArticlesResponse
import com.example.api.models.Response.MultipleArticleResponse
import com.example.api.models.Response.TagListResponse
import retrofit2.Response
import retrofit2.http.*

interface ConduitAPI {

    @GET("articles")
    suspend fun getArticles(): Response<ArticlesResponse>

    //

    @POST("users/login")
    suspend fun loginUser(@Body loginUserRequest: LoginUserRequest) : Response<User>


    @POST("users")
    suspend fun registerUser(@Body registerUserRequest: RegisterUserRequest) : Response<User>


    @GET("user")
    suspend fun getCurrentUser() : Response<User>


    @PUT("user")
    suspend fun updateUser(@Body user: User) : Response<User>


    @GET("profiles/:{username}")
    suspend fun getUserProfile(@Path("username") username : String) : Response<Profile>


    @POST("profiles/:{username}/follow")
    suspend fun followUser(@Path("username") username : String) : Response<Profile>


    @DELETE("profiles/:{username}/follow")
    suspend fun unfollowUser(@Path("username") username : String) : Response<Profile>


    @GET("articles")
    suspend fun getAllArticles() : Response<MultipleArticleResponse>


    @GET("articles/feed")
    suspend fun getArticlesByFeed() : Response<MultipleArticleResponse>


    @GET("articles/:{slug}")
    suspend fun getSingleArticle(@Path("slug") slug : String)


    @POST("articles")
    suspend fun createArticle(@Body createPostArticle: CreatePostArticle) : Response<Article>


    @PUT("articles/:{slug}")
    suspend fun updateArticle(@Body createPostArticle: CreatePostArticle) : Response<Article>


    @DELETE("articles/:{slug}")
    suspend fun deleteArticle(@Path("slug") slug : String)


    @POST("articles/:{slug}/comments")
    suspend fun postComment(@Path("slug") slug : String , @Body comment: Comment) : Response<com.example.api.models.Entities.Comment>


    @GET("articles/:{slug}/comments")
    suspend fun getAllCommentsFromArticle(@Path("slug") slug : String) : Response<MultipleCommentsResponse>


    @DELETE("articles/:{slug}/comments/:{id}")
    suspend fun deleteCommentFromArticle(@Path("slug") slug : String , @Path("id") id: String)


    @POST("articles/:{slug}/favorite")
    suspend fun addToFavourites(@Path("slug") slug : String) : Response<Article>


    @DELETE("articles/:{slug}/favorite")
    suspend fun deleteFromFavourites(@Path("slug") slug : String) : Response<Article>


    @GET("tags")
    suspend fun getAllTags() : Response<TagListResponse>

}