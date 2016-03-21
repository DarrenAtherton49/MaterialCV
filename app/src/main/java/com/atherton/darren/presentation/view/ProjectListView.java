package com.atherton.darren.presentation.view;

import com.atherton.darren.data.entity.Project;

/**
 * Interface representing a View to show a user's projects in a list.
 */
public interface ProjectListView extends ProfileListView {

    /**
     * Render user's project data in the UI.
     *
     * @param userProject
     *      The {@link Project} that will be shown.
     */
    void renderProjectList(Project userProject);
}