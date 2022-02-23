package com.dio.portifolio_github_app.data.service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface GithubService {
    @GET("users/{user}/repos")
    suspend fun listRepos(@Path("user") user : String?)
}
