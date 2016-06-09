package com.atherton.darren.presentation.experience;

import com.atherton.darren.data.experience.Experience;
import com.atherton.darren.presentation.profile.ProfileListView;

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
