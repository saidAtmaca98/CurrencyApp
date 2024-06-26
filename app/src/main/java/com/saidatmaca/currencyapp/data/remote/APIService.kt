package com.saidatmaca.currencyapp.data.remote

import com.saidatmaca.currencyapp.domain.model.ApiResponse
import com.saidatmaca.currencyapp.domain.model.HistoryApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface APIService {


    @GET("coins")
    suspend fun getAllCryptoData(): ApiResponse




    @GET("coin/{id}/history?timePeriod=1y")
    suspend fun getCryptoHistoryPrice(@Path("id") coinId: String): HistoryApiResponse


}