package com.dio.portifolio_github_app.data.service

import com.dio.portifolio_github_app.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path


interface GithubService {
    @GET("users/{user}/repos")
    suspend fun listRepos(@Path("user") user : String?) : List<Repo>
}
