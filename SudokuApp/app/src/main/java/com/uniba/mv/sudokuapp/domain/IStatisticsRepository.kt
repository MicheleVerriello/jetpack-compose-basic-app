package com.uniba.mv.sudokuapp.domain

interface IStatisticsRepository {

    suspend fun getStatistic(
        onSuccess: (UserStatistics) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun updateStatistic(
        time: Long,
        diff: Difficulty,
        boundary: Int,
        onSuccess: (isRecord: Boolean) -> Unit,
        onError: (Exception) -> Unit
    )
}