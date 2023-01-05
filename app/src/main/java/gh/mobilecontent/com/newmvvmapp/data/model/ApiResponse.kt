package gh.mobilecontent.com.newmvvmapp.data.model


import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("articles")
    val articles: MutableList<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)