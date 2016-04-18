package com.atherton.darren.presentation.injection.module;

import android.support.v7.app.AppCompatActivity;

import com.atherton.darren.presentation.injection.scope.PerScreen;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    /**
     * Exposes the activity to dependents in the graph.
     */
    @Provides @PerScreen AppCompatActivity activity() {
        return this.activity;
    }
}
