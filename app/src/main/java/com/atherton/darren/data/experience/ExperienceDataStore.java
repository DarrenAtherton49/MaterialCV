package com.atherton.darren.data.experience;

import java.util.List;

import rx.Observable;

public interface ExperienceDataStore {

  Observable<List<Experience>> experienceList();
}
