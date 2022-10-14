package net.denis.numbers.data.repository

import net.denis.numbers.data.remote.NumbersApi
import net.denis.numbers.domain.repository.FactRepository
import javax.inject.Inject

class FactRepositoryImpl @Inject constructor(
    private val api: NumbersApi
): FactRepository {

    override suspend fun getFactByNumber(number: Int): String {
        return api.getFactByNumber(number).toResponseData().fact
    }
}