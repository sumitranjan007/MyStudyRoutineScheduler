package com.srcorp.mystudyroutinescheduler.support

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.srcorp.mystudyroutinescheduler.support.CommonKeyWords.TAG_MASTER

fun localMessages(msg:String,context:Context){
    Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
}
fun localLog(className:String,msg: String){
    Log.d(TAG_MASTER,"[$className] $msg")
}