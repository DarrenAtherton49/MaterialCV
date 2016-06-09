package com.atherton.darren.presentation.main;

import android.support.annotation.NonNull;

import com.atherton.darren.presentation.injection.scope.PerScreen;

@PerScreen
public class MainTabbedPresenterImpl implements MainTabbedPresenter {

    private MainTabbedView mainTabbedView;

    public MainTabbedPresenterImpl() {

    }

    @Override public void setView(@NonNull MainTabbedView mainTabbedView) {
        this.mainTabbedView = mainTabbedView;
    }

    @Override public void init() {
        // todo this.mainTabbedView to do any initial animations, circular reveals etc.
    }

    @Override public void resume() {

    }

    @Override public void pause() {

    }

    @Override public void destroy() {
        this.mainTabbedView = null;
    }

    @Override public void onPageSelected(int position) {
        this.mainTabbedView.renderHeaderForTab(position);
    }
}
