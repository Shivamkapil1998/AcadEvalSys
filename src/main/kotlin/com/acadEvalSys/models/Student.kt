package com.acadEvalSys.models

import java.sql.RowId

data class Student(
    var uuid : String? = null,
    var name : String? = null,
    var email : String? = null,
    var subjects : MutableList<Subject> = mutableListOf(),
    var department : String? = null,
    var documents : MutableList<String> = mutableListOf(),
    var institutionId: String? = null
) {

}