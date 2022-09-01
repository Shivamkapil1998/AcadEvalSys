package com.acadEvalSys.models

import sun.security.x509.AccessDescription

data class Subject(
    var subCode : String? = null,
    var name : String? = null,
    var description: String? = null,
    var departmentsAssociated : MutableList<String>? = null,
    var credits : Int? = 0
) {
}