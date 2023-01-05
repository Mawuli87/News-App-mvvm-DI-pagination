package gh.mobilecontent.com.newmvvmapp.domain.usecase

import gh.mobilecontent.com.newmvvmapp.data.model.Article
import gh.mobilecontent.com.newmvvmapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow


class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}