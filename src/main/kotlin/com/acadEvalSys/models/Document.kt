package com.acadEvalSys.models

data class Document(
    var uuid : String? = null,
    var name : String? = null,
    var isExpirable : Boolean = false,
    var resourceType : String? = null,
    var resourceId : String? = null,
    var createdAt : Long? = null,
    var createdBy : String? = null,
    var institutionId : String? = null
) {
}