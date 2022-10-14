package net.denis.numbers.domain.repository

import net.denis.numbers.domain.model.ResponseData

interface FactRepository {

    suspend fun getFactByNumber(number: Int): String
}