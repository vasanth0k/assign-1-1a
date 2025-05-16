package com.vas.githubsearch.data.api

import com.vas.githubsearch.data.model.ProfileResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubSearchService {

    @GET("search/repositories")
    suspend fun getProfiles(
        @Query("q") query: String = "language:kotlin",
        @Query("sort") sort: String = "stars",
        @Query("order") order: String = "desc"
    ): Response<ProfileResponse>

}