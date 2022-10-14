package net.denis.numbers.di.domain

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import net.denis.numbers.domain.repository.FactRepository
import net.denis.numbers.domain.usecase.GetFactUseCase
import net.denis.numbers.domain.usecase.SaveFactUseCase


@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetFactUseCase(factRepository: FactRepository): GetFactUseCase {
        return GetFactUseCase(factRepository = factRepository)
    }

    @Provides
    fun provideSaveFactUseCase(factRepository: FactRepository): SaveFactUseCase {
        return SaveFactUseCase(factRepository = factRepository)
    }

}