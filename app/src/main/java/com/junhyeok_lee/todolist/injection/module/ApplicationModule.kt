package com.junhyeok_lee.todolist.injection.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by junhyeok_lee on 2018. 2. 11..
 */
@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
     fun provideApplication(): Application = application

    @Provides
    fun provideSharedPrefs(): SharedPreferences =
            application.getSharedPreferences("kotlinWithAndroid", Context.MODE_PRIVATE)


    @Provides
    fun provideEditor(pref: SharedPreferences): SharedPreferences.Editor = pref.edit()
}