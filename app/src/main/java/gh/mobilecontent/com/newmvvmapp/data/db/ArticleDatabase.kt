package gh.mobilecontent.com.newmvvmapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import gh.mobilecontent.com.newmvvmapp.data.model.Article


@Database(
    entities = [Article::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract  class ArticleDatabase : RoomDatabase(){
    abstract fun getArticleDAO(): ArticleDAO
}

