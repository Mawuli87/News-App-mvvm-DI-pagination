package gh.mobilecontent.com.newmvvmapp.data.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gh.mobilecontent.com.newmvvmapp.data.viewmodel.NewsViewModelFactory
import gh.mobilecontent.com.newmvvmapp.domain.usecase.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
  fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadLinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase,
        deleteSavedNewsUseCase: DeleteSavedNewsUseCase
  ): NewsViewModelFactory {
      return NewsViewModelFactory(
          application,
          getNewsHeadlinesUseCase,
         getSearchedNewsUseCase,
          saveNewsUseCase,
          getSavedNewsUseCase,
          deleteSavedNewsUseCase
      )
  }

}








