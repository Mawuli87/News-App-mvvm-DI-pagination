package gh.mobilecontent.com.newmvvmapp.domain.repository

import gh.mobilecontent.com.newmvvmapp.data.model.ApiResponse
import gh.mobilecontent.com.newmvvmapp.data.model.Article
import gh.mobilecontent.com.newmvvmapp.data.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(country : String, page : Int): Resource<ApiResponse>

    suspend fun getSearchedNews(country: String,searchQuery:String,page: Int) : Resource<ApiResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}