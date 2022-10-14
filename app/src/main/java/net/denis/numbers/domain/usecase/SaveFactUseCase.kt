package net.denis.numbers.domain.usecase

import net.denis.numbers.domain.repository.FactRepository
import javax.inject.Inject

class SaveFactUseCase @Inject constructor(
    private val factRepository: FactRepository
) {

}