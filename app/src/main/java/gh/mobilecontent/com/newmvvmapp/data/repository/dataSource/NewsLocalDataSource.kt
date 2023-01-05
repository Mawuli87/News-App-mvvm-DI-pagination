package gh.mobilecontent.com.newmvvmapp.data.repository.dataSource


import gh.mobilecontent.com.newmvvmapp.data.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
    fun getSavedArticles(): Flow<List<Article>>
    suspend fun deleteArticlesFromDB(article: Article)


}