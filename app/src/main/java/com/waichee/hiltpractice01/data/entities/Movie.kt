package com.waichee.hiltpractice01.data.entities


import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("video")
    val video: Boolean = false,
    @SerializedName("vote_count")
    val voteCount: Int = 0,
    @SerializedName("vote_average")
    val voteAverage: Double = 0.0,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("release_date")
    val releaseDate: String = "",
    @SerializedName("original_language")
    val originalLanguage: String = "",
    @SerializedName("original_title")
    val originalTitle: String = "",
    @SerializedName("genre_ids")
    val genreIds: List<Int> = listOf(),
    @SerializedName("backdrop_path")
    val backdropPath: String = "",
    @SerializedName("adult")
    val adult: Boolean = false,
    @SerializedName("overview")
    val overview: String = "",
    @SerializedName("poster_path")
    val posterPath: String = "",
    @SerializedName("popularity")
    val popularity: Double = 0.0,
    @SerializedName("media_type")
    val mediaType: String = ""
)