package gh.mobilecontent.com.newmvvmapp.data.api

import gh.mobilecontent.com.newmvvmapp.BuildConfig
import gh.mobilecontent.com.newmvvmapp.data.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApiServices {

    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country:String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String = BuildConfig.NEWS_API
    ): Response<ApiResponse>

    @GET("v2/top-headlines")
    suspend fun getSearchedTopHeadlines(
        @Query("country")
        country:String,
        @Query("q")
        searchQuery:String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String = BuildConfig.NEWS_API
    ): Response<ApiResponse>

}