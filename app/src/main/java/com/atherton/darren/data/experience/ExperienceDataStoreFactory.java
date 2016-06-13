package com.atherton.darren.data.experience;

import android.content.Context;

import com.atherton.darren.data.networking.RestApi;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Factory that creates different implementations of {@link ExperienceDataStore}.
 */
@Singleton
public class ExperienceDataStoreFactory {

  private final RestApi restApi;

  @Inject
  public ExperienceDataStoreFactory(Context context, RestApi restApi) {
    if (context == null || restApi == null) {
      throw new IllegalArgumentException("Constructor parameters cannot be null!");
    }
    this.restApi = restApi;
  }

  /**
   * Create {@link ExperienceDataStore} to retrieve data from the server.
   */
  @Inject public ExperienceDataStore createCloudDataStore() {
    return new ExperienceCloudDataStore(restApi);
  }
}
