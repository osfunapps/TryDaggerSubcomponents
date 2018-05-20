package com.osapps.daggersubcomponent.dagger.localrepo

import android.content.Context
import android.content.SharedPreferences
import com.osapps.daggersubcomponent.dagger.localrepo.infrastructure.localrepository.LocalRepository
import com.osapps.daggersubcomponent.dagger.localrepo.infrastructure.localrepository.LocalRepositoryImpl
import com.osapps.daggersubcomponent.dagger.localrepo.scopes.StorageScope
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
class StorageModule {

    //shared preferences
    @Provides
    @Reusable
    fun provideSharedPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences("app_sp", Context.MODE_PRIVATE)
    }

    @Provides
    @Reusable
    fun provideLocalRepository(prefs: SharedPreferences): LocalRepository {
        return LocalRepositoryImpl(prefs)
    }

}