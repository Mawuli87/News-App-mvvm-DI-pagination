package gh.mobilecontent.com.newmvvmapp.data.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gh.mobilecontent.com.newmvvmapp.domain.repository.NewsRepository
import gh.mobilecontent.com.newmvvmapp.domain.usecase.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
   @Singleton
   @Provides
   fun provideGetNewsHeadLinesUseCase(
       newsRepository: NewsRepository
   ):GetNewsHeadLinesUseCase{
      return GetNewsHeadLinesUseCase(newsRepository)
   }

   @Singleton
   @Provides
   fun provideGetSearchedNewsUseCase(
      newsRepository: NewsRepository
   ): GetSearchedNewsUseCase {
      return GetSearchedNewsUseCase(newsRepository)
   }

   @Singleton
   @Provides
   fun provideSaveNewsUseCase(
      newsRepository: NewsRepository
   ): SaveNewsUseCase {
      return SaveNewsUseCase(newsRepository)
   }

   @Singleton
   @Provides
   fun provideGetSavedNewsUseCase(
      newsRepository: NewsRepository
   ): GetSavedNewsUseCase {
      return GetSavedNewsUseCase(newsRepository)
   }

   @Singleton
   @Provides
   fun provideDeleteSavedNewsUseCase(
      newsRepository: NewsRepository
   ): DeleteSavedNewsUseCase {
      return DeleteSavedNewsUseCase(newsRepository)
   }
}


















