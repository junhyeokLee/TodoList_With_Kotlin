package com.junhyeok_lee.todolist


import android.app.Application
import com.junhyeok_lee.todolist.injection.components.ApplicationComponent
import com.junhyeok_lee.todolist.injection.components.DaggerApplicationComponent
import com.junhyeok_lee.todolist.injection.module.ApplicationModule

/**
 * Created by junhyeok_lee on 2018. 2. 10..
 */
class KotlinWithAndroid : Application() {

     lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}