package com.atherton.darren.presentation.injection.component;

import com.atherton.darren.presentation.injection.module.ActivityModule;
import com.atherton.darren.presentation.injection.module.MainActivityModule;
import com.atherton.darren.presentation.injection.scope.PerScreen;
import com.atherton.darren.presentation.main.MainActivity;

import dagger.Component;

@PerScreen
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class, MainActivityModule.class})
public interface MainActivityComponent extends ActivityComponent {
    void inject(MainActivity mainActivity);
}
