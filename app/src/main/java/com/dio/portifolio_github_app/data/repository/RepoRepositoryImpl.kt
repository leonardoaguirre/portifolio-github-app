package com.dio.portifolio_github_app.data.repository

import com.dio.portifolio_github_app.data.model.Repo
import com.dio.portifolio_github_app.data.service.GithubService
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service: GithubService) : RepoRepository {
    override suspend fun listRepos(user: String) = flow {
        val repoList = service.listRepos(user)
        emit(repoList)
    }

}