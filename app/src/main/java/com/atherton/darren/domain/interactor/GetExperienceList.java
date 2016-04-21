package com.atherton.darren.domain.interactor;

import com.atherton.darren.domain.executor.PostExecutionThread;
import com.atherton.darren.domain.executor.ThreadExecutor;
import com.atherton.darren.domain.repository.ExperienceRepository;

import javax.inject.Inject;

import rx.Observable;

public class GetExperienceList extends UseCase {

  private final ExperienceRepository experienceRepository;

  @Inject
  public GetExperienceList(ExperienceRepository experienceRepository, ThreadExecutor threadExecutor,
                           PostExecutionThread postExecutionThread) {
    super(threadExecutor, postExecutionThread);
    this.experienceRepository = experienceRepository;
  }

  @Override public Observable buildUseCaseObservable() {
    return this.experienceRepository.experiences();
  }
}
