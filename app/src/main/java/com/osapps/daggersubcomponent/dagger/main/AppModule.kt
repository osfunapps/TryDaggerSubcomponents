package com.osapps.daggersubcomponent.dagger.main

import android.app.Application
import android.content.Context
import android.support.annotation.NonNull
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(@NonNull private val appContext: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context = appContext
}
