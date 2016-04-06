package com.atherton.darren.presentation.view;

import com.atherton.darren.data.entity.Project;

import java.util.List;

/**
 * Interface representing a View to show a user's projects in a list.
 */
public interface ProjectListView extends ProfileListView {

    /**
     * Render user's project data in the UI.
     *
     * @param projectList
     *      The listof {@link Project} that will be shown.
     */
    void renderProjectList(List<Project> projectList);
}