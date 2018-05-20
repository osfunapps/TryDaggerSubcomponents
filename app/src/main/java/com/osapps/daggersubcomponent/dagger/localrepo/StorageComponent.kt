package com.osapps.daggersubcomponent.dagger.localrepo

import com.osapps.daggersubcomponent.dagger.localrepo.scopes.StorageScope
import dagger.Subcomponent

@Subcomponent(modules = [StorageModule::class])
@StorageScope
interface StorageComponent {
    //fun inject(mainActivity: MainActivity)
}

