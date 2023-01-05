package gh.mobilecontent.com.newmvvmapp.data.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gh.mobilecontent.com.newmvvmapp.data.api.NewsApiServices
import gh.mobilecontent.com.newmvvmapp.data.repository.dataSource.NewsRemoteDataSource
import gh.mobilecontent.com.newmvvmapp.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: NewsApiServices
    ): NewsRemoteDataSource {
       return NewsRemoteDataSourceImpl(newsAPIService)
    }

}












