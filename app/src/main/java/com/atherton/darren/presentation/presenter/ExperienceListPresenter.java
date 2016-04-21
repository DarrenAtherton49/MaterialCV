package com.atherton.darren.presentation.presenter;

import android.support.annotation.NonNull;

import com.atherton.darren.data.entity.Experience;
import com.atherton.darren.domain.interactor.DefaultSubscriber;
import com.atherton.darren.domain.interactor.UseCase;
import com.atherton.darren.presentation.injection.scope.PerScreen;
import com.atherton.darren.presentation.view.ExperienceListView;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

@PerScreen
public class ExperienceListPresenter implements Presenter {

    private static final String LOAD_EXPERIENCES_ERROR_MESSAGE = "Could not fetch experience list!";

    private ExperienceListView experienceListView;

    private final UseCase getExperienceListUseCase;

    @Inject
    public ExperienceListPresenter(@Named("experienceList") UseCase getExperienceListUseCase) {
        this.getExperienceListUseCase = getExperienceListUseCase;
    }

    public void setView(@NonNull ExperienceListView experienceListView) {
        this.experienceListView = experienceListView;
    }

    @Override public void resume() {

    }

    @Override public void pause() {

    }

    @Override public void destroy() {
        this.getExperienceListUseCase.unsubscribe();
        this.experienceListView = null;
    }

    public void init() {
        this.loadExperienceList();
    }

    /**
     * Loads all Experience items.
     */
    private void loadExperienceList() {
        this.hideRetryView();
        this.showProgressView();
        this.getExperienceList();
    }

    public void onExperienceClicked(Experience experience) {
        this.experienceListView.viewExperience(experience);
    }


    private void showProgressView() {
        this.experienceListView.showProgess();
    }

    private void hideProgressView() {
        this.experienceListView.showProgess();
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
            ExperienceListPresenter.this.hideProgressView();
        }

        @Override public void onError(Throwable e) {
            ExperienceListPresenter.this.hideProgressView();
            ExperienceListPresenter.this.showErrorMessage(LOAD_EXPERIENCES_ERROR_MESSAGE);
            ExperienceListPresenter.this.showRetryView();
        }

        @Override public void onNext(List<Experience> experiences) {
            ExperienceListPresenter.this.showExperiencesInView(experiences);
        }
    }
}
