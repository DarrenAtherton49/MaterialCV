package com.atherton.darren.presentation.navigation;

import android.content.Context;

import javax.inject.Inject;

/**
 * Class used to navigate through the application via either activity/intents
 * or fragment transactions
 */
public class AppNavigator {

    /**
     * Allows Dagger to return a reference to this field when this class
     * is needed by a dependent, e.g. {@link com.atherton.darren.presentation.view.activity.BaseActivity}
     * or {@link com.atherton.darren.presentation.view.fragment.BaseFragment}
     */
    @Inject
    public AppNavigator() {

    }

    /**
     * Navigates to the biography detail screen.
     *
     * @param context Context needed to open the target activity.
     * @param biographyId id needed to specify a Biography project.
     */
    public void navigateToBiographyDetail(Context context, int biographyId) {
        if (context != null) {
            // todo add intent and start activity
        }
    }

    /**
     * Navigates to the experience detail screen.
     *
     * @param context Context needed to open the target activity.
     * @param experienceId id needed to specify an Experience object.
     */
    public void navigateToExperienceDetail(Context context, int experienceId) {
        if (context != null) {
            // todo add intent and start activity
        }
    }

    /**
     * Navigates to the education detail screen.
     *
     * @param context Context needed to open the target activity.
     * @param educationId id needed to specify an Education object.
     */
    public void navigateToEducationDetail(Context context, int educationId) {
        if (context != null) {
            // todo add intent and start activity
        }
    }

    /**
     * Navigates to the profile detail screen.
     *
     * @param context Context needed to open the target activity.
     * @param projectId id needed to specify a Project object.
     */
    public void navigateToProjectDetail(Context context, int projectId) {
        if (context != null) {
            // todo add intent and start activity
        }
    }
}
