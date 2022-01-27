package com.pcs.tokokita.response.transaksi

data class TransaksiResponse(
    val `data`: Data,
    val message: String,
    val success: Boolean
)