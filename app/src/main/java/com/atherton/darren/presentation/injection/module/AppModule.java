package com.atherton.darren.presentation.injection.module;

import android.content.Context;

import com.atherton.darren.presentation.AndroidApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides objects which last for the entire app lifecycle
 */
@Module
public class AppModule {

    private final AndroidApplication mApplication;

    public AppModule(AndroidApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication;
    }
}
