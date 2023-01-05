package gh.mobilecontent.com.newmvvmapp.data.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gh.mobilecontent.com.newmvvmapp.adapter.NewsAdapter
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {
   @Singleton
   @Provides
   fun provideNewsAdapter(): NewsAdapter {
       return NewsAdapter()
   }
}