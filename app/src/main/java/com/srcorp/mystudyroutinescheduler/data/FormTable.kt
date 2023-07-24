package com.srcorp.mystudyroutinescheduler.data

data class FormTable(
    val formId:Int,
    val formDate:String,
    val subjectsList: List<SubjectModel>,

)
