package com.junhyeok_lee.todolist.injection.scopes

import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention
import javax.inject.Scope

/**
 * Created by junhyeok_lee on 2018. 2. 11..
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityScope
