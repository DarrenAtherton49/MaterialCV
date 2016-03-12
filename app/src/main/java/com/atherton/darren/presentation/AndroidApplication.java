package com.atherton.darren.presentation;

import android.app.Application;

import com.atherton.darren.presentation.injection.component.AppComponent;
import com.atherton.darren.presentation.injection.component.DaggerAppComponent;
import com.atherton.darren.presentation.injection.module.AppModule;

import timber.log.Timber;

public class AndroidApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initInjection();
        initLogger();
    }

    private void initInjection() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    private void initLogger() {
        Timber.plant(new Timber.DebugTree());
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
