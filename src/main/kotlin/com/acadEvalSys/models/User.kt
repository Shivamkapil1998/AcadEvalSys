package com.acadEvalSys.models

import com.google.gson.GsonBuilder

data class User(
    var uuid : String? = null,
    var userType : String? = null,
    var email : String? =null,
    var mobNumber : String? = null,
    var password : String? = null
){
    constructor() : this(null,null,null,null,null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}
