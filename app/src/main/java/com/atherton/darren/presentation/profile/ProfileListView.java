package com.atherton.darren.presentation.profile;

import com.atherton.darren.presentation.base.DataLoadingView;

/**
 * Interface representing a View to show an aspect of a user profile.
 */
public interface ProfileListView extends DataLoadingView {

    /**
     * Show a button to contact the user in the UI
     */
    void showContactButton();

    /**
     * Hide a button to contact the user in the UI
     */
    void hideContactButton();
}
