package com.atherton.darren.presentation.injection.module;

import android.support.v7.app.AppCompatActivity;

import com.atherton.darren.presentation.injection.scope.PerActivity;
import com.atherton.darren.presentation.view.adapter.MainViewPagerAdapter;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides adapters
 */
@Module
public class AdapterModule {

    private final AppCompatActivity activity;

    public AdapterModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides @PerActivity MainViewPagerAdapter provideMainViewPagerAdapter() {
        return new MainViewPagerAdapter(activity.getSupportFragmentManager());
    }
}
