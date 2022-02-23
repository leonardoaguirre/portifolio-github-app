package com.dio.portifolio_github_app.domain.di

import com.dio.portifolio_github_app.data.di.DataModule
import com.dio.portifolio_github_app.domain.ListUserRepositoryUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {
    fun load(){
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule() : Module{
        return module {
            factory { ListUserRepositoryUseCase(get()) }
        }
    }
}