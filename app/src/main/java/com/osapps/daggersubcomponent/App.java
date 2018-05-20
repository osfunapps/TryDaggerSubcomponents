package com.osapps.daggersubcomponent;

import android.app.Application;

import com.osapps.daggersubcomponent.dagger.localrepo.StorageComponent;
import com.osapps.daggersubcomponent.dagger.localrepo.StorageModule;
import com.osapps.daggersubcomponent.dagger.main.AppModule;
import com.osapps.daggersubcomponent.dagger.main.DaggerMainComponent;
import com.osapps.daggersubcomponent.dagger.main.MainComponent;
import com.osapps.daggersubcomponent.dagger.music.MusicComponent;
import com.osapps.daggersubcomponent.dagger.music.MusicModule;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by osapps on 20/05/2018.
 */
public class App extends Application {

    public static MainComponent mainComponent;
    public static StorageComponent storageComponent;
    public static MusicComponent musicComponent;

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

/*
    @Override
    protected AndroidInjector<? extends App> applicationInjector() {
        return DaggerMainComponent.builder().create(this);
    }
*/

}
