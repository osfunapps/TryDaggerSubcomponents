package com.osapps.daggersubcomponent.dagger.music

import android.content.Context
import android.content.SharedPreferences
import com.osapps.daggersubcomponent.dagger.music.scopes.MusicScope
import com.osapps.daggersubcomponent.dagger.localrepo.infrastructure.localrepository.LocalRepository
import com.osapps.daggersubcomponent.dagger.localrepo.infrastructure.localrepository.LocalRepositoryImpl
import com.osapps.daggersubcomponent.dagger.music.instances.MusicInstance
import dagger.Module
import dagger.Provides

@Module
class MusicModule {

  /*  //shared preferences
    @Provides
    @MusicScope
    fun provideMusicInstance(context: Context, localRepository: LocalRepository): MusicInstance {
        return MusicInstance(context, localRepository)
    }*/
}