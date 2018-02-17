package com.junhyeok_lee.todolist.injection.components

import com.junhyeok_lee.todolist.injection.module.ActivityModule
import com.junhyeok_lee.todolist.injection.scopes.ActivityScope
import com.junhyeok_lee.todolist.ui.main.MainActivity
import dagger.Component

/**
 * Created by junhyeok_lee on 2018. 2. 11..
 */
@Component(dependencies = [(ApplicationComponent::class)], modules = [(ActivityModule::class)])
@ActivityScope
interface ActivityComponent : ApplicationComponent {

    fun inject(activity : MainActivity)

}