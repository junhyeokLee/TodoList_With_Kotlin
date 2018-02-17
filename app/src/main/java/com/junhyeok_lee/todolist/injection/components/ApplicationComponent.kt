package com.junhyeok_lee.todolist.injection.components

import android.content.SharedPreferences
import com.junhyeok_lee.todolist.KotlinWithAndroid
import com.junhyeok_lee.todolist.injection.module.ApplicationModule
import dagger.Component
import dagger.Module
import javax.inject.Singleton

/**
 * Created by junhyeok_lee on 2018. 2. 11..
 */
@Singleton
@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {

    val sharedPreferences : SharedPreferences

    val editor : SharedPreferences.Editor

    fun inject(kotlinWithAndroid: KotlinWithAndroid)
}