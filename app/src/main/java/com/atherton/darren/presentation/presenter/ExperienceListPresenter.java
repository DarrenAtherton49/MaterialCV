package com.atherton.darren.presentation.presenter;

import android.support.annotation.NonNull;

import com.atherton.darren.data.entity.Experience;
import com.atherton.darren.presentation.injection.scope.PerActivity;
import com.atherton.darren.presentation.view.ExperienceListView;

@PerActivity
public class ExperienceListPresenter implements Presenter {

    private ExperienceListView experienceListView;

    // todo add private final UseCases

    // todo add constructor

    public void setView(@NonNull ExperienceListView experienceListView) {
        this.experienceListView = experienceListView;
    }

    @Override public void resume() {

    }

    @Override public void pause() {

    }

    @Override public void destroy() {
        // todo unsubscribe from use case
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

    // todo methods to get the data

    private void getExperienceList() {

    }
}
