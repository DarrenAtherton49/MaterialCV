package com.atherton.darren.presentation.view;

import com.atherton.darren.data.entity.Experience;

import java.util.List;

/**
 * Interface representing a View to show a user's commercial
 * experience in a list.
 */
public interface ExperienceListView extends ProfileListView {

    /**
     * Render user's work experience data in the UI.
     *
     * @param experienceList
     *      The list of {@link Experience} that will be shown.
     */
    void renderExperienceList(List<Experience> experienceList);

    void viewExperience(Experience experience);
}
