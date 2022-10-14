package net.denis.numbers.data.remote

import net.denis.numbers.domain.model.ResponseData

data class NumberFactDTO(
    val date: String,
    val found: Boolean,
    val number: Int,
    val text: String,
    val type: String
) {
    fun toResponseData(): ResponseData = ResponseData(
        fact = text
    )
}