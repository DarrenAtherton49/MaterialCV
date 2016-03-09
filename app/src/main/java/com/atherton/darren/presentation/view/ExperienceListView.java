package com.atherton.darren.presentation.view;

import com.atherton.darren.data.entity.UserExperience;

/**
 * Interface representing a View to show a user's commercial
 * experience in a list.
 */
public interface ExperienceListView extends ProfileListView {

    /**
     * Render user's work experience data in the UI.
     *
     * @param userExperience The {@link UserExperience} that will be shown.
     */
    void renderExperienceList(UserExperience userExperience);
}
