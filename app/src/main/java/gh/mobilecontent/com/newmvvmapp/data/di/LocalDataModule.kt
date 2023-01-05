package gh.mobilecontent.com.newmvvmapp.data.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gh.mobilecontent.com.newmvvmapp.data.db.ArticleDAO
import gh.mobilecontent.com.newmvvmapp.data.repository.dataSource.NewsLocalDataSource
import gh.mobilecontent.com.newmvvmapp.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
      return NewsLocalDataSourceImpl(articleDAO)
    }

}













