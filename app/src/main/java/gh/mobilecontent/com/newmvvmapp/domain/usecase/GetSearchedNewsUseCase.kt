package gh.mobilecontent.com.newmvvmapp.domain.usecase

import gh.mobilecontent.com.newmvvmapp.data.model.ApiResponse
import gh.mobilecontent.com.newmvvmapp.data.utils.Resource
import gh.mobilecontent.com.newmvvmapp.domain.repository.NewsRepository


class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country:String,searchQuery:String,page:Int): Resource<ApiResponse> {
        return newsRepository.getSearchedNews(country,searchQuery,page)
    }
}