package com.dio.portifolio_github_app.data.repository

import com.dio.portifolio_github_app.core.RemoteException
import com.dio.portifolio_github_app.data.service.GithubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GithubService) : RepoRepository {
    override suspend fun listRepos(user: String) = flow {
        try {
        val repoList = service.listRepos(user)
        emit(repoList)
        }catch (ex : HttpException){
            throw RemoteException(ex.message ?: "Não foi possivel fazer a busca")
        }
    }

}