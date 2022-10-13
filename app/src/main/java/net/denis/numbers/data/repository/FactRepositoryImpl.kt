package net.denis.numbers.data.repository

import net.denis.numbers.domain.model.ResponseData
import net.denis.numbers.domain.repository.FactRepository
import javax.inject.Inject

class FactRepositoryImpl @Inject constructor(

): FactRepository {

    override fun getFact(): ResponseData {
        TODO("Not yet implemented")
    }

    override fun saveFact(responseData: ResponseData) {
        TODO("Not yet implemented")
    }
}