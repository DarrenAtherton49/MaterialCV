package com.atherton.darren.presentation.injection.module;

import com.atherton.darren.domain.interactor.GetExperienceList;
import com.atherton.darren.domain.interactor.UseCase;
import com.atherton.darren.presentation.injection.scope.PerScreen;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ExperienceModule {

    @Provides @PerScreen @Named("experienceList") UseCase provideGetUserListUseCase(
            GetExperienceList getExperienceList) {
        return getExperienceList;
    }

    //todo add provideGetUserDetailUseCase here too
}
