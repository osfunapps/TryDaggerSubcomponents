package com.osapps.daggersubcomponent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.osapps.daggersubcomponent.dagger.activities.MainActivityView
import com.osapps.daggersubcomponent.dagger.localrepo.infrastructure.localrepository.LocalRepository
import com.osapps.daggersubcomponent.dagger.music.instances.MusicInstance
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainActivityView {


    @Inject lateinit var localRepository: LocalRepository

    override fun presenterDone() {

    }


    //@Inject lateinit var localRepository: LocalRepository


    //@Inject lateinit var musicInstance: MusicInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.storageComponent!!.inject(this)
        println(localRepository)
        //App.musicComponent.inject(this)
      //  println(musicInstance)
    }
}
