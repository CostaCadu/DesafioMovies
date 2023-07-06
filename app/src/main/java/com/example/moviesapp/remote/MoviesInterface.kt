package com.example.moviesapp.remote

import com.example.moviesapp.utils.Constants.API_KEY
import com.example.moviesapp.utils.Constants.LANG_PTBR
import retrofit2.http.GET
import retrofit2.http.Query


interface MoviesInterface {

   @GET("movie/now_playing")
   suspend fun getAllMovies(
      @Query ("api_key") apiKey: String = API_KEY,
      @Query ("language") lang: String = LANG_PTBR,
      @Query ("page") page: Int
   ):
}