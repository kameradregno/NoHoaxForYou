package com.example.ujian.data.network

import com.example.ujian.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/merdeka/teknologi")
    fun getMerdekaTechNews(
        @Query("q") q: String = "teknologi",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>

    @GET("/merdeka/otomotif")
    fun getMerdekaAutoNews(
        @Query("q") q: String = "otomotif",
        @Query("language") language: String = "id",
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>

    @GET("/merdeka/dunia")
    fun getMerdekaWorldNews(
        @Query("q") q: String = "sejarah",
        @Query("language") language: String = "id",
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>

    @GET("/tempo/tekno")
    fun getTempoTechNews(
        @Query("q") q: String = "tekno",
        @Query("language") language: String = "id",
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>

    @GET("/tempo/otomotif")
    fun getTempoAutoNews(
        @Query("q") q: String = "otomotif",
        @Query("language") language: String = "id",
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>

    @GET("/tempo/metro")
    fun getTempoMetroNews(
        @Query("q") q: String = "otomotif",
        @Query("language") language: String = "id",
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>

    @GET("/cnn/teknologi")
    fun getCNNTechNews(
        @Query("q") q: String = "teknologi",
        @Query("language") language: String = "id",
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>

    @GET("/cnn/hiburan")
    fun getCNNEntertainmentNews(
        @Query("q") q: String = "hiburan",
        @Query("language") language: String = "id",
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>

    @GET("/cnn/ekonomi")
    fun getCNNEconomyNews(
        @Query("q") q: String = "sejarah",
        @Query("language") language: String = "id",
        @Query("sortBy") sortBy: String = "popularity"
    ) : Call<NewsResponse>


}