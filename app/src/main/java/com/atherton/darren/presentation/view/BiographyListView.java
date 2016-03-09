package com.atherton.darren.presentation.view;

import com.atherton.darren.data.entity.UserBio;

/**
 * Interface representing a View to show a user's biography in a list.
 */
public interface BiographyListView extends ProfileListView {

    /**
     * Render user's biography data in the UI.
     *
     * @param userBio The {@link UserBio} that will be shown.
     */
    void renderBiographyList(UserBio userBio);
}
