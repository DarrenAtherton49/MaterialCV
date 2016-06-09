package com.atherton.darren.presentation.injection.module;

import android.support.v7.app.AppCompatActivity;

import com.atherton.darren.presentation.injection.scope.PerScreen;
import com.atherton.darren.presentation.main.MainTabbedPresenter;
import com.atherton.darren.presentation.main.MainTabbedPresenterImpl;
import com.atherton.darren.presentation.main.MainViewPagerAdapter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private final AppCompatActivity activity;

    public MainActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides @PerScreen MainViewPagerAdapter provideMainViewPagerAdapter() {
        return new MainViewPagerAdapter(this.activity.getSupportFragmentManager());
    }

    @Provides @PerScreen MainTabbedPresenter provideMainTabbedPresenter() {
        return new MainTabbedPresenterImpl();
    }
}
