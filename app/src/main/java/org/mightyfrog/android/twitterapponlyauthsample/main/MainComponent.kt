package org.mightyfrog.android.twitterapponlyauthsample.main

import dagger.Component
import org.mightyfrog.android.twitterapponlyauthsample.AppComponent
import org.mightyfrog.android.twitterapponlyauthsample.util.ActivityScope

/**
 * @author Shigehiro Soejima
 */
@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [MainModule::class])
interface MainComponent {

    fun inject(activity: MainActivity)
}