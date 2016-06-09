package com.atherton.darren.presentation.injection.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.atherton.darren.data.executor.JobExecutor;
import com.atherton.darren.data.experience.ExperienceDataRepository;
import com.atherton.darren.domain.executor.PostExecutionThread;
import com.atherton.darren.domain.executor.ThreadExecutor;
import com.atherton.darren.domain.experience.ExperienceRepository;
import com.atherton.darren.presentation.AndroidApplication;
import com.atherton.darren.presentation.UIThread;
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

    @Provides @Singleton ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }

    @Provides @Singleton PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }

    @Provides @Singleton ExperienceRepository provideExperienceRepository(ExperienceDataRepository experienceDataRepository) {
        return experienceDataRepository;
    }

    //todo provide a cache
}
