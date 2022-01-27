package com.pcs.tokokita

import com.pcs.tokokita.response.cart.Cart

interface CallbackInterface {
    fun passResultCallback(total:String,cart:ArrayList<Cart>)
}