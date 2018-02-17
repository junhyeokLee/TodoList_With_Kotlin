package com.junhyeok_lee.todolist.datas

/**
 * Created by junhyeok_lee on 2018. 2. 11..
 */
data class Todo (
        var id:Int,
        var body:String,
        var isChecked:Boolean,
        var isFixed:Boolean = false)