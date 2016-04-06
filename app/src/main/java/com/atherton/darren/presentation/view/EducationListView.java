package com.atherton.darren.presentation.view;

import com.atherton.darren.data.entity.Education;

import java.util.List;

/**
 * Interface representing a View to show a user's education in a list.
 */
public interface EducationListView extends ProfileListView {

    /**
     * Render user's education data in the UI.
     *
     * @param educationList
     *      The list of {@link Education} that will be shown.
     */
    void renderEducationList(List<Education> educationList);
}