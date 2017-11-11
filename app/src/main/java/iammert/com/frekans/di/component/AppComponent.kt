package iammert.com.frekans.di.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import iammert.com.frekans.FrekansApplication
import iammert.com.frekans.di.module.AppModule
import iammert.com.frekans.di.module.ViewModelModule
import javax.inject.Singleton

/**
 * Created by mertsimsek on 08/11/2017.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ViewModelModule::class))
interface AppComponent : AndroidInjector<FrekansApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<FrekansApplication>()
}