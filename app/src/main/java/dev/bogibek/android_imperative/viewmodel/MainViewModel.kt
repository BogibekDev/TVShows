package dev.bogibek.android_imperative.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.bogibek.android_imperative.model.TVShow
import dev.bogibek.android_imperative.model.TVShowDetails
import dev.bogibek.android_imperative.model.TVShowPopular
import dev.bogibek.android_imperative.repository.TVShowRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val tvShowRepository: TVShowRepository) :
    ViewModel() {

    val isLoading = MutableLiveData<Boolean>()
    val errorMessage = MutableLiveData<String>()
    val tvShowsFromApi = MutableLiveData<ArrayList<TVShow>>()
    val tvShowPopular = MutableLiveData<TVShowPopular>()
    val tvShowDetails = MutableLiveData<TVShowDetails>()


    /**
     * Retrofit Related
     */

    fun apiTVShowPopular(page: Int) {

    }

    fun apiTVShowDetails(q: Int) {

    }

    /**
     * Room Related
     */
}