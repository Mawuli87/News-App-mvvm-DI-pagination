package gh.mobilecontent.com.newmvvmapp.data.repository

import gh.mobilecontent.com.newmvvmapp.data.model.ApiResponse
import gh.mobilecontent.com.newmvvmapp.data.model.Article
import gh.mobilecontent.com.newmvvmapp.data.repository.dataSource.NewsLocalDataSource
import gh.mobilecontent.com.newmvvmapp.data.repository.dataSource.NewsRemoteDataSource
import gh.mobilecontent.com.newmvvmapp.data.utils.Resource
import gh.mobilecontent.com.newmvvmapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(
    private val newsRemoteDataSource: NewsRemoteDataSource,
    private val newsLocalDataSource: NewsLocalDataSource
):NewsRepository {
    override suspend fun getNewsHeadlines(country: String, page: Int): Resource<ApiResponse> {
        return responseToResource(newsRemoteDataSource.getTopHeadlines(country,page))
    }


    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Resource<ApiResponse> {
        return responseToResource(
            newsRemoteDataSource.getSearchedNews(country,searchQuery,page)
        )
    }

    private fun responseToResource(response: Response<ApiResponse>):Resource<ApiResponse>{
        if(response.isSuccessful){
            response.body()?.let {result->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }




    override suspend fun saveNews(article: Article) {
        newsLocalDataSource.saveArticleToDB(article)
    }

    override suspend fun deleteNews(article: Article) {
        newsLocalDataSource.deleteArticlesFromDB(article)
    }

    override fun getSavedNews(): Flow<List<Article>> {
        return newsLocalDataSource.getSavedArticles()
    }
}