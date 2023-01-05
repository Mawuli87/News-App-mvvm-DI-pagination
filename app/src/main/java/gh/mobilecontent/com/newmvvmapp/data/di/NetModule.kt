package gh.mobilecontent.com.newmvvmapp.data.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gh.mobilecontent.com.newmvvmapp.BuildConfig
import gh.mobilecontent.com.newmvvmapp.data.api.NewsApiServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
         return Retrofit.Builder()
             .addConverterFactory(GsonConverterFactory.create())
             .baseUrl(BuildConfig.NEWS_BASE_URL)
             .build()
    }

    @Singleton
    @Provides
    fun provideNewsAPIService(retrofit: Retrofit): NewsApiServices {
        return retrofit.create(NewsApiServices::class.java)
    }



}













