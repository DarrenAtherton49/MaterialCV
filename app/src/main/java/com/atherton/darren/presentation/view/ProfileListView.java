package com.atherton.darren.presentation.view;

/**
 * Interface representing a View to show an aspect of a user profile.
 */
public interface ProfileListView {

    /**
     * Show a button to contact the user in the UI
     */
    void showContactButton();

    /**
     * Hide a button to contact the user in the UI
     */
    void hideContactButton();
}
