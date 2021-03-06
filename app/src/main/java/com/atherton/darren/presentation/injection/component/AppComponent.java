package com.atherton.darren.presentation.injection.component;

import android.content.Context;

import com.atherton.darren.data.networking.RestApi;
import com.atherton.darren.domain.executor.PostExecutionThread;
import com.atherton.darren.domain.executor.ThreadExecutor;
import com.atherton.darren.domain.experience.ExperienceRepository;
import com.atherton.darren.presentation.AndroidApplication;
import com.atherton.darren.presentation.injection.module.AppModule;
import com.atherton.darren.presentation.base.BaseActivity;
import com.atherton.darren.presentation.base.BaseFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Dagger component which lasts for the entire app lifecycle
 */
@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
  void inject(BaseActivity baseActivity);
  void inject(BaseFragment baseFragment);

  Context context();
  AndroidApplication application();
  ThreadExecutor threadExecutor();
  PostExecutionThread postExecutionThread();
  RestApi restApi();
  ExperienceRepository experienceRepository();
}
