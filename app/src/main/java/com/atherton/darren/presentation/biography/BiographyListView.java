package com.atherton.darren.presentation.biography;

import com.atherton.darren.data.biography.Biography;
import com.atherton.darren.presentation.profile.ProfileListView;

/**
 * Interface representing a View to show a user's biography in a list.
 */
public interface BiographyListView extends ProfileListView {

    /**
     * Render user's biography data in the UI.
     *
     * @param userBio
     *      The {@link Biography} that will be shown.
     */
    void renderBiographyList(Biography userBio);
}
