package com.osapps.daggersubcomponent.dagger.main


import com.osapps.daggersubcomponent.dagger.localrepo.StorageComponent
import com.osapps.daggersubcomponent.dagger.localrepo.StorageModule
import com.osapps.daggersubcomponent.dagger.music.MusicComponent
import com.osapps.daggersubcomponent.dagger.music.MusicModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface MainComponent {
    fun buildStorageComponent(storageModule: StorageModule): StorageComponent
    fun buildMusicComponent(storageModule: StorageModule, musicModule: MusicModule): MusicComponent
}

/*

interface MainComponent : AndroidInjector<App> {

    // fun buildStorageComponent(storageModule: StorageModule): StorageComponent
    // fun buildMusicComponent(storageModule: StorageModule, musicModule: MusicModule): MusicComponent
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
 */

