package com.bigpro.fakenewsapp

import com.bigpro.fakenewsapp.PostResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("posts")
    fun getPosts(): Call<ArrayList<PostResponse>>

}