package com.atherton.darren.presentation.injection.component;

import com.atherton.darren.presentation.injection.module.ActivityModule;
import com.atherton.darren.presentation.injection.module.ExperienceModule;
import com.atherton.darren.presentation.injection.scope.PerScreen;
import com.atherton.darren.presentation.experience.ExperienceListFragment;

import dagger.Component;

@PerScreen
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class, ExperienceModule.class})
public interface ExperienceComponent extends ActivityComponent {
    void inject(ExperienceListFragment experienceListFragment);
    // void inject(ExperienceDetailActivity experienceDetailActivity); //todo uncomment
}
