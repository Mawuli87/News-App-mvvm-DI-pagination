package gh.mobilecontent.com.newmvvmapp.domain.usecase

import gh.mobilecontent.com.newmvvmapp.data.model.Article
import gh.mobilecontent.com.newmvvmapp.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)= newsRepository.deleteNews(article)
}