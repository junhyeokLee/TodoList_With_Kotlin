package com.junhyeok_lee.todolist.injection.module

import android.app.Activity
import com.junhyeok_lee.todolist.injection.scopes.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by junhyeok_lee on 2018. 2. 11..
 */
@Module
class ActivityModule(private val activity : Activity) {
    @Provides
    @ActivityScope
internal fun provideActivity(): Activity = activity
}