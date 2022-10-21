package net.denis.numbers.domain.usecase

import net.denis.numbers.domain.repository.FactRepository
import javax.inject.Inject

class GetFactUseCase @Inject constructor(
    private val factRepository: FactRepository
){
    suspend operator fun invoke(number: Int, type: String): String {
        return factRepository.getFactByNumber(number, type)
    }
}
