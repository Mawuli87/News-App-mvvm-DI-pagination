package gh.mobilecontent.com.newmvvmapp.data.db

import androidx.room.TypeConverter
import gh.mobilecontent.com.newmvvmapp.data.model.Source


class Converters {
    @TypeConverter
    fun fromSource(source: Source):String?{
           return source.name
    }
    @TypeConverter
    fun toSource(name:String):Source{
        return Source(name,name)
    }
}
