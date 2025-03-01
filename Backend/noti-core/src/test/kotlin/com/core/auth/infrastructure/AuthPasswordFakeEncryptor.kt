package com.core.auth.infrastructure

import com.core.auth.domain.AuthPasswordEncryptor

class AuthPasswordFakeEncryptor : AuthPasswordEncryptor {

    override fun encrypt(password: String): String {
        return "encrypted"
    }

    override fun matches(password: String, encodedPassword: String): Boolean {
        return true
    }
}