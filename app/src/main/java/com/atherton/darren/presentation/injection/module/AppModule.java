package com.atherton.darren.presentation.injection.module;

import com.atherton.darren.presentation.AndroidApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides objects which last for the entire app lifecycle
 */
@Module
public class AppModule {

    private final AndroidApplication application;

    public AppModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides @Singleton AndroidApplication provideApplication() {
        return application;
    }
}
