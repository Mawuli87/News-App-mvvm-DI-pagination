package gh.mobilecontent.com.newmvvmapp.data.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import gh.mobilecontent.com.newmvvmapp.domain.usecase.*

class NewsViewModelFactory(
    private val app:Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadLinesUseCase,
    private val getSearchedNewsUseCase: GetSearchedNewsUseCase,
    private val saveNewsUseCase: SaveNewsUseCase,
    private val getSavedNewsUseCase: GetSavedNewsUseCase,
    private val deleteSavedNewsUseCase: DeleteSavedNewsUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(
            app,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase,
            deleteSavedNewsUseCase
        ) as T
    }
}

//override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//    return NewsViewModel(
//        app,
//        getNewsHeadlinesUseCase,
////            getSearchedNewsUseCase,
////            saveNewsUseCase,
////            getSavedNewsUseCase,
////            deleteSavedNewsUseCase
//    ) as T
//}







