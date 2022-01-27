package com.pcs.tokokita.response.login

data class LoginResponse(
    val `data`: Data,
    val message: String,
    val success: Boolean
)