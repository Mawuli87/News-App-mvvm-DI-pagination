package gh.mobilecontent.com.newmvvmapp.data.repository.dataSource

import gh.mobilecontent.com.newmvvmapp.data.model.ApiResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country : String, page : Int): Response<ApiResponse>

    suspend fun getSearchedNews(country : String,searchQuery:String, page : Int):Response<ApiResponse>
}