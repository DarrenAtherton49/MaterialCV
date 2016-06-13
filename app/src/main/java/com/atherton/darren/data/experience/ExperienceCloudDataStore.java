package com.atherton.darren.data.experience;

import com.atherton.darren.data.networking.RestApi;

import java.util.List;

import rx.Observable;

/**
 * {@link ExperienceDataStore} implementation based on connections to the server.
 */
public class ExperienceCloudDataStore implements ExperienceDataStore {

  private final RestApi restApi;

  /**
   * Construct a {@link ExperienceDataStore} based on connections to the server.
   */
  public ExperienceCloudDataStore(RestApi restApi) {
    this.restApi = restApi;
  }

  @Override public Observable<List<Experience>> experienceList() {
    return this.restApi.getExperiences();
  }
}
