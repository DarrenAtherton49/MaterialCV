package com.atherton.darren.ui.base;

/**
 * The presenter class of each MVP candidate in the app must implement this interface
 * or extend BasePresenter and define the type of MvpView to be used.
 */
public interface MvpPresenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}
