package com.atherton.darren.domain.experience;

import com.atherton.darren.data.experience.Experience;

import java.util.List;

import rx.Observable;

/**
 * Interface that represents a Repository for getting {@link Experience} related data.
 */
public interface ExperienceRepository {
  /**
   * Get an {@link rx.Observable} which will emit a List of {@link Experience}.
   */
  Observable<List<Experience>> experiences();

  /**
   * Get an {@link rx.Observable} which will emit a single {@link Experience}.
   *
   * @param experienceId The experience id used to retrieve user data.
   */
  Observable<Experience> experience(final int experienceId);
}
