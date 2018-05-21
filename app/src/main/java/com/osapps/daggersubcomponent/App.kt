package com.osapps.daggersubcomponent

import android.app.Application

import com.osapps.daggersubcomponent.dagger.localrepo.StorageComponent
import com.osapps.daggersubcomponent.dagger.localrepo.StorageModule
import com.osapps.daggersubcomponent.dagger.main.AppModule
import com.osapps.daggersubcomponent.dagger.main.DaggerMainComponent
import com.osapps.daggersubcomponent.dagger.main.MainComponent
import com.osapps.daggersubcomponent.dagger.music.MusicComponent
import com.osapps.daggersubcomponent.dagger.music.MusicModule
import com.osapps.daggersubcomponent.neww.DaggerAppComponent

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by osapps on 20/05/2018.
 */
class App : DaggerApplication() {

    /*
    @Override
    public void onCreate() {
        super.onCreate();

        //create main component
        mainComponent = DaggerMainComponent.builder().appModule(new AppModule(this)).build();

        //create secondary component
        StorageModule storageModule = new StorageModule();
        storageComponent = mainComponent.buildStorageComponent(storageModule);

        //create music component
        musicComponent = mainComponent.buildMusicComponent(storageModule, new MusicModule());

    }
*/

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {

        val storageModule = StorageModule();
        //build the app component
        mainComponent = DaggerMainComponent.builder().application(this).build()

        //storageComponent
        storageComponent = mainComponent!!.buildStorageComponent(storageModule);

        //inject the app into it
        mainComponent!!.inject(this)
        //return the app component
        return mainComponent!!
    }

    companion object {

        var mainComponent: MainComponent? = null
        var storageComponent: StorageComponent? = null
        var musicComponent: MusicComponent? = null
    }

}
