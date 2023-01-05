package gh.mobilecontent.com.newmvvmapp.data.repository.dataSourceImpl

import gh.mobilecontent.com.newmvvmapp.data.api.NewsApiServices
import gh.mobilecontent.com.newmvvmapp.data.model.ApiResponse
import gh.mobilecontent.com.newmvvmapp.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiServices
):NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String, page: Int): Response<ApiResponse> {
        return newsApiService.getTopHeadlines(country,page)
    }


    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Response<ApiResponse> {
        return newsApiService.getSearchedTopHeadlines(country,searchQuery,page)
    }

}