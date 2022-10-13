package net.denis.numbers.domain.repository

import net.denis.numbers.domain.model.ResponseData

interface FactRepository {

    fun getFact(): ResponseData

    fun saveFact(responseData: ResponseData)

}