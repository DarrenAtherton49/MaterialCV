package com.atherton.darren.data.experience;

import com.atherton.darren.domain.experience.ExperienceRepository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

@Singleton
public class ExperienceDataRepository implements ExperienceRepository {

    private final ExperienceDataStoreFactory experienceDataStoreFactory;

    @Inject
    public ExperienceDataRepository(ExperienceDataStoreFactory experienceDataStoreFactory) {
        this.experienceDataStoreFactory = experienceDataStoreFactory;
    }

    @Override public Observable<List<Experience>> experiences() {
        final ExperienceDataStore dataStore = this.experienceDataStoreFactory.createCloudDataStore();
//        return dataStore.experienceList()
//                .map(userEntities -> this.userEntityDataMapper.transform(userEntities));
        //todo transform with mapper
        return dataStore.experienceList();
    }

    //todo implement method properly
    @Override public Observable<Experience> experience(final int experienceId) {
        return Observable.empty();
    }
}

