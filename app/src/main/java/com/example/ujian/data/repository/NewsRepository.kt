package com.example.ujian.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.ujian.data.model.NewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.example.ujian.data.network.ApiClient

class NewsRepository {

    private val _merdekaTechNews = MutableLiveData<NewsResponse>()
    val merdekaTechNews: LiveData<NewsResponse> = _merdekaTechNews

    private val _merdekaAutoNews = MutableLiveData<NewsResponse>()
    val merdekaAutoNews: LiveData<NewsResponse> = _merdekaAutoNews

    private val _merdekaHistoryNews = MutableLiveData<NewsResponse>()
    val merdekaHistoryNews: LiveData<NewsResponse> = _merdekaHistoryNews

    private val _tempoTechNews = MutableLiveData<NewsResponse>()
    val tempoTechNews: LiveData<NewsResponse> = _tempoTechNews

    private val _tempoAutoNews = MutableLiveData<NewsResponse>()
    val tempoAutoNews: LiveData<NewsResponse> = _tempoAutoNews

    private val _tempoHistoryNews = MutableLiveData<NewsResponse>()
    val tempoHistoryNews: LiveData<NewsResponse> = _tempoHistoryNews

    private val _cnnTechNews = MutableLiveData<NewsResponse>()
    val cnnTechNews: LiveData<NewsResponse> = _cnnTechNews

    private val _cnnEntertainmentNews = MutableLiveData<NewsResponse>()
    val cnnEntertainmentNews: LiveData<NewsResponse> = _cnnEntertainmentNews

    private val _cnnHistoryNews = MutableLiveData<NewsResponse>()
    val cnnHistoryNews: LiveData<NewsResponse> = _cnnHistoryNews

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun getMerdekaTechNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getMerdekaTechNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _merdekaTechNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getMerdekaAutoNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getMerdekaAutoNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _merdekaAutoNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getMerdekaHistoryNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getMerdekaHistoryNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _merdekaHistoryNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getTempoTechNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getTempoTechNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _tempoTechNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getTempoAutoNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getTempoAutoNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _tempoAutoNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getTempoHistoryNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getTempoHistoryNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _tempoHistoryNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCNNTechNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCNNTechNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnTechNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCNNEntertainmentNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCNNEntertainmentNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnEntertainmentNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCNNHistoryNews(){
        _isLoading.value = true
        ApiClient.provideApiService().getCNNHistoryNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _cnnHistoryNews.postValue(response.body())
                        } else {
                            Log.e("Repository",
                                "onResponse: Call error with HTTP status code" + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e("Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }
}
