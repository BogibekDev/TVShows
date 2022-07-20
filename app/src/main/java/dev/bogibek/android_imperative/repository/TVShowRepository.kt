package dev.bogibek.android_imperative.repository

import dev.bogibek.android_imperative.network.TVShowService
import javax.inject.Inject

class TVShowRepository @Inject constructor(private val tvShowService: TVShowService) {
    /**
     * Retrofit Related
     */
    suspend fun apiTVShowPopular(page: Int) = tvShowService.apiTVShowPopular(page)
    suspend fun apiTVShowDetails(q: Int) = tvShowService.apiTVShowDetails(q)

    /**
     * Room Related
     */

}