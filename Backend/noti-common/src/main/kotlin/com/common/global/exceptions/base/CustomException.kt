package com.common.global.exceptions.base

import com.common.global.exceptions.base.CustomExceptionType

open class CustomException(
    private val customExceptionType: CustomExceptionType
) : RuntimeException("[${customExceptionType.subject}]: ${customExceptionType.message}") {

    fun getExceptionType(): CustomExceptionType {
        return customExceptionType
    }
}