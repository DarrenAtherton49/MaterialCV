package com.atherton.darren.presentation.injection.component;

import com.atherton.darren.presentation.injection.module.AdapterModule;
import com.atherton.darren.presentation.injection.scope.PerActivity;
import com.atherton.darren.presentation.view.activity.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = AdapterModule.class)
public interface AdapterComponent {
    void inject(MainActivity mainActivity);
}
