package net.denis.numbers.domain.usecase

import net.denis.numbers.domain.model.ResponseData
import net.denis.numbers.domain.repository.FactRepository
import javax.inject.Inject

class SaveFactUseCase @Inject constructor(
    private val factRepository: FactRepository
) {

    operator fun invoke(responseData: ResponseData) {
        return factRepository.saveFact(responseData = responseData)
    }

}