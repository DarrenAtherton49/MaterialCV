package com.atherton.darren.presentation.experience;

import android.support.annotation.NonNull;

import com.atherton.darren.data.experience.Experience;
import com.atherton.darren.domain.interactor.DefaultSubscriber;
import com.atherton.darren.domain.interactor.UseCase;
import com.atherton.darren.presentation.injection.scope.PerScreen;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

@PerScreen
public class ExperienceListPresenterImpl implements ExperienceListPresenter {

    private static final String LOAD_EXPERIENCES_ERROR_MESSAGE = "Could not fetch experience list!";

    private ExperienceListView experienceListView;

    private final UseCase getExperienceListUseCase;

    //todo add data mapper

    //todo inject data mapper
    @Inject
    public ExperienceListPresenterImpl(@Named("experienceList") UseCase getExperienceListUseCase) {
        this.getExperienceListUseCase = getExperienceListUseCase;
    }

    public void setView(@NonNull ExperienceListView experienceListView) {
        this.experienceListView = experienceListView;
    }

    @Override public void init() {
        this.loadExperienceList();
        // todo start any initial animations
    }

    @Override public void resume() {

    }

    @Override public void pause() {

    }

    @Override public void destroy() {
        this.getExperienceListUseCase.unsubscribe();
        this.experienceListView = null;
    }

    public void onExperienceClicked(Experience experience) {
        this.experienceListView.viewExperience(experience);
    }

    /**
     * Loads all Experience items.
     */
    private void loadExperienceList() {
        this.hideRetryView();
        this.showProgressView();
        this.getExperienceList();
    }

    private void showProgressView() {
        this.experienceListView.showProgress();
    }

    private void hideProgressView() {
        this.experienceListView.hideProgress();
    }

    private void showRetryView() {
        this.experienceListView.showRetry();
    }

    private void hideRetryView() {
        this.experienceListView.hideRetry();
    }

    private void showErrorMessage(String errorMessage) {
        this.experienceListView.showError(errorMessage);
    }
    
    private void getExperienceList() {
        this.getExperienceListUseCase.execute(new ExperienceListSubscriber());
    }

    private void showExperiencesInView(List<Experience> experiences) {
        this.experienceListView.renderExperienceList(experiences);
    }

    private final class ExperienceListSubscriber extends DefaultSubscriber<List<Experience>> {

        @Override public void onCompleted() {
            ExperienceListPresenterImpl.this.hideProgressView();
        }

        @Override public void onError(Throwable e) {
            ExperienceListPresenterImpl.this.hideProgressView();
            ExperienceListPresenterImpl.this.showErrorMessage(LOAD_EXPERIENCES_ERROR_MESSAGE);
            ExperienceListPresenterImpl.this.showRetryView();
        }

        @Override public void onNext(List<Experience> experiences) {
            ExperienceListPresenterImpl.this.showExperiencesInView(experiences);
        }
    }
}
