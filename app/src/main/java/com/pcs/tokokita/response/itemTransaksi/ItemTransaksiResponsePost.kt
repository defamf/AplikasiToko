package com.pcs.tokokita.response.itemTransaksi

data class ItemTransaksiResponsePost(
    val `data`: Data,
    val message: String,
    val success: Boolean
)