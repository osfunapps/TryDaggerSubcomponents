package com.osapps.daggersubcomponent.dagger.music

import com.osapps.daggersubcomponent.dagger.localrepo.StorageModule
import com.osapps.daggersubcomponent.dagger.music.scopes.MusicScope
import dagger.Subcomponent


@Subcomponent(modules = [MusicModule::class, StorageModule::class])
@MusicScope
interface MusicComponent {
   // fun inject(mainActivity: MainActivity)
}


