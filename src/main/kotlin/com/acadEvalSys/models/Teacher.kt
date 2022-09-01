package com.acadEvalSys.models

data class Teacher(
    var uuid : String? = null,
    var subjects : MutableList<Subject>? = null,
    var name : String? = null,
    var email : String? = null,
    var userId : String? = null,
    var department : String? = null
) {
}