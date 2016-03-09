package com.atherton.darren.presentation.view;

import com.atherton.darren.data.entity.UserEducation;

/**
 * Interface representing a View to show a user's education in a list.
 */
public interface EducationListView extends ProfileListView {

    /**
     * Render user's education data in the UI.
     *
     * @param userEducation The {@link UserEducation} that will be shown.
     */
    void renderEducationList(UserEducation userEducation);
}