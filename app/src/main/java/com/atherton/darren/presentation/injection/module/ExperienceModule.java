package com.atherton.darren.presentation.injection.module;

import com.atherton.darren.domain.experience.GetExperienceList;
import com.atherton.darren.domain.interactor.UseCase;
import com.atherton.darren.presentation.injection.scope.PerScreen;
import com.atherton.darren.presentation.experience.ExperienceListPresenter;
import com.atherton.darren.presentation.experience.ExperienceListPresenterImpl;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ExperienceModule {

    @Provides @PerScreen ExperienceListPresenter provideExperienceListPresenter(GetExperienceList getExperienceListUseCase) {
        return new ExperienceListPresenterImpl(getExperienceListUseCase);
    }

    @Provides @PerScreen @Named("experienceList") UseCase provideGetUserListUseCase(
            GetExperienceList getExperienceList) {
        return getExperienceList;
    }

    //todo add provideGetUserDetailUseCase here too
}
