package gh.mobilecontent.com.newmvvmapp.domain.usecase

import gh.mobilecontent.com.newmvvmapp.data.model.ApiResponse
import gh.mobilecontent.com.newmvvmapp.data.utils.Resource
import gh.mobilecontent.com.newmvvmapp.domain.repository.NewsRepository


class GetNewsHeadLinesUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country : String, page : Int): Resource<ApiResponse> {
        return newsRepository.getNewsHeadlines(country,page)
    }
}