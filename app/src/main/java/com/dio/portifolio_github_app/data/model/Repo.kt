package com.dio.portifolio_github_app.data.model

data class Repo (
    val id : Long,
    val name : String,
    val owner : String,
    val stargazersCount : Long,
    val language : String,
    val htmlUrl : String,
    val description : String
        )
