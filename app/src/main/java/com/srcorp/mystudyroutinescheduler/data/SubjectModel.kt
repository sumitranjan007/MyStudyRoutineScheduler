package com.srcorp.mystudyroutinescheduler.data

import androidx.room.Entity

@Entity(tableName = "subject_table")
data class SubjectModel(
    val subjectId:Int,
    val subjectName:String,
    val description:String,
    val image:Int,
    val isTodayChecked:Boolean,

)
