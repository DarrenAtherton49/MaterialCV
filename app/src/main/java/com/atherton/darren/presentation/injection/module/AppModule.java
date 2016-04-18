package com.atherton.darren.presentation.injection.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.atherton.darren.presentation.AndroidApplication;
import com.atherton.darren.presentation.navigation.AppNavigator;

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
        return this.application;
    }

    @Provides @Singleton Context provideApplicationContext() {
        return this.application;
    }

    @Provides @Singleton SharedPreferences provideSharedPrefs() {
        return PreferenceManager.getDefaultSharedPreferences(this.application);
    }

    @Provides @Singleton AppNavigator provideNavigator() {
        return new AppNavigator();
    }
}
