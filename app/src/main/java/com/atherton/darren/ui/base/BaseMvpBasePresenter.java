package com.atherton.darren.ui.base;

import com.atherton.darren.exceptions.MvpViewNotAttachedException;

/**
 * Base presenter class which implements the MvpPresenter interface, defining
 * implementations for attachView() and detachView(). Keeps a reference to the
 * view element of the MVP candidate.
 */
public class BaseMvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    @Override
    public void attachView(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }
}