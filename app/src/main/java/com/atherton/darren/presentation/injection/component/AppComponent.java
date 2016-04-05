package com.atherton.darren.presentation.injection.component;

import com.atherton.darren.presentation.AndroidApplication;
import com.atherton.darren.presentation.injection.module.AppModule;
import com.atherton.darren.presentation.view.activity.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Dagger component which lasts for the entire app lifecycle
 */
@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
  void inject(BaseActivity baseActivity);

  AndroidApplication application();
}
