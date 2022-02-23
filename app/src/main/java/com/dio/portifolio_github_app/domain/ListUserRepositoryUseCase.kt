package com.dio.portifolio_github_app.domain

import com.dio.portifolio_github_app.core.UseCase
import com.dio.portifolio_github_app.data.model.Repo
import com.dio.portifolio_github_app.data.repository.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoryUseCase(
    private val repoRepository: RepoRepository
    ) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repoRepository.listRepos(param)
    }
}