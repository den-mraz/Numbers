package net.denis.numbers.domain.usecase

import net.denis.numbers.domain.model.ResponseData
import net.denis.numbers.domain.repository.FactRepository
import javax.inject.Inject

class GetFactUseCase @Inject constructor(
    private val factRepository: FactRepository
) {

    operator fun invoke(): ResponseData {
        return factRepository.getFact()
    }

}