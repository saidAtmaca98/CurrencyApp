package com.saidatmaca.currencyapp.domain.model

data class HistoryApiData(
    val change: Float,
    val history: List<HistoryModel>
)
