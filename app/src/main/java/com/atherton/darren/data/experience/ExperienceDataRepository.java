package com.atherton.darren.data.experience;

import com.atherton.darren.domain.experience.ExperienceRepository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

@Singleton
public class ExperienceDataRepository implements ExperienceRepository {

    //todo implement full constructor
    @Inject
    public ExperienceDataRepository() {

    }

    //todo implement method properly
    @Override public Observable<List<Experience>> experiences() {
        return Observable.empty();
    }

    //todo implement method properly
    @Override public Observable<Experience> experience(final int experienceId) {
        return Observable.empty();
    }
}

