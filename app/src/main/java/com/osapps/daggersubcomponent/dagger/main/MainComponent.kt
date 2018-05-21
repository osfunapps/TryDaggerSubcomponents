package com.osapps.daggersubcomponent.dagger.main


import android.app.Application
import com.osapps.daggersubcomponent.App
import com.osapps.daggersubcomponent.dagger.activities.ActivityBuilder
import com.osapps.daggersubcomponent.dagger.localrepo.StorageComponent
import com.osapps.daggersubcomponent.dagger.localrepo.StorageModule
import com.osapps.daggersubcomponent.dagger.localrepo.infrastructure.localrepository.LocalRepository
import com.osapps.daggersubcomponent.dagger.music.MusicComponent
import com.osapps.daggersubcomponent.dagger.music.MusicModule
import com.osapps.daggersubcomponent.neww.AppComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

/*
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class])
@Singleton
interface MainComponent {
    fun buildStorageComponent(storageModule: StorageModule): StorageComponent
    fun buildMusicComponent(storageModule: StorageModule, musicModule: MusicModule): MusicComponent
}
*/


@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBuilder::class])
@MainScope
interface MainComponent : AndroidInjector<DaggerApplication> {


    //Injection types incl Application or Service type
    fun inject(app: App)  //application injection

    //fun inject(service: FirebaseTokenService)  //service injection example
    fun buildStorageComponent(storageModule: StorageModule): StorageComponent

    fun localRepo(): LocalRepository


    //fun buildMusicComponent(storageModule: StorageModule, musicModule: MusicModule): MusicComponent

    //a generic builder
    override fun inject(instance: DaggerApplication)


    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): MainComponent
    }
}

