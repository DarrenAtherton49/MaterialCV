package com.atherton.darren.exceptions;

/**
 * This exception is thrown when the view has not been attached to the presenter
 * before attempting to access data.
 */
public class MvpViewNotAttachedException extends BaseMvpException {

    public MvpViewNotAttachedException() {
        super("You must attach the presenter to the view by calling " +
                "presenter.attachView(MvpView) before accessing data via the Presenter");
    }
}