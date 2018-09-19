package org.mightyfrog.android.twitterapponlyauthsample.main

import dagger.Module
import dagger.Provides
import org.mightyfrog.android.twitterapponlyauthsample.util.ActivityScope

/**
 * @author Shigehiro Soejima
 */
@Module
class MainModule(val view: MainContract.View) {

    @ActivityScope
    @Provides
    fun provideMainContractView(): MainContract.View = view
}