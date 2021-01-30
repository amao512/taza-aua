package com.aslnstbk.tazaaua.home.di

import com.aslnstbk.tazaaua.home.data.DefaultHomeRepository
import com.aslnstbk.tazaaua.home.data.HomeApiService
import com.aslnstbk.tazaaua.home.domain.HomeRepository
import com.aslnstbk.tazaaua.home.presentation.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val homeModule = module {

    viewModel {
        HomeViewModel(
            homeRepository = get()
        )
    }

    single {
        val retrofit: Retrofit = get()

        retrofit.create(HomeApiService::class.java)
    }

    factory {
        DefaultHomeRepository(
            homeApiService = get(),
            responseApiDataMapper = get()
        ) as HomeRepository
    }
}