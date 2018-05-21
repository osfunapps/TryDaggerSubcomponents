package com.osapps.daggersubcomponent.dagger.localrepo

import android.app.Application
import android.content.SharedPreferences
import com.osapps.daggersubcomponent.App
import com.osapps.daggersubcomponent.MainActivity
import com.osapps.daggersubcomponent.dagger.localrepo.infrastructure.localrepository.LocalRepository
import com.osapps.daggersubcomponent.dagger.localrepo.scopes.StorageScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [StorageModule::class])
@StorageScope
interface StorageComponent {

    fun inject(mainActivity: MainActivity)


    //fun inject(mainActivity: MainActivity)
    //fun localRepo(): LocalRepository
    fun sharedPrefs(): SharedPreferences

}


/*
//@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class])
@Subcomponent(modules = [StorageModule::class])
@StorageScope
interface StorageComponent : AndroidInjector<App> {

    // fun buildStorageComponent(storageModule: StorageModule): StorageComponent
    // fun buildMusicComponent(storageModule: StorageModule, musicModule: MusicModule): MusicComponent
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): StorageComponent
    }
}
*/