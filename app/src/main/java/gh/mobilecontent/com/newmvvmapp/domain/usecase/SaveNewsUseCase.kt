package gh.mobilecontent.com.newmvvmapp.domain.usecase

import gh.mobilecontent.com.newmvvmapp.data.model.Article
import gh.mobilecontent.com.newmvvmapp.domain.repository.NewsRepository


class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.saveNews(article)
}