package com.atherton.darren.presentation.view;

import android.content.Context;

/**
 * The view class for each MVP candidate in the app must implement this interface.
 * For each View in the app (i.e. an Activity or Fragment), you should extend this
 * interface via an interface specific to that View.
 */
public interface DataLoadingView {

    /**
     * Show an error message in the event that loading fails
     *
     * @param message
     *      A string representing an error.
     */
    void showError(String message);

    /**
     * Show a view with a progress bar indicating a loading process.
     */
    void showProgess();

    /**
     * Hide a loading view.
     */
    void hideProgress();

    /**
     * Show a retry view in the event of an error when loading data.
     */
    void showRetry();

    /**
     * Hide a retry view shown previously shown.
     */
    void hideRetry();

    /**
     * Get a {@link android.content.Context}.
     */
    Context context();
}