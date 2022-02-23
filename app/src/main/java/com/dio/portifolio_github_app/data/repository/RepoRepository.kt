package com.dio.portifolio_github_app.data.repository

import com.dio.portifolio_github_app.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepos(user : String) : Flow<List<Repo>>
}