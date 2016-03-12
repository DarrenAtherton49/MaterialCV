package com.atherton.darren.presentation.navigation;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Class used to navigate through the application via either activity/intents
 * or fragment transactions
 */
@Singleton
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
     */
    public void navigateToBiographyDetail(Context context) {
        if (context != null) {

        }
    }

    /**
     * Navigates to the experience detail screen.
     *
     * @param context Context needed to open the target activity.
     */
    public void navigateToExperienceDetail(Context context) {
        if (context != null) {

        }
    }

    /**
     * Navigates to the education detail screen.
     *
     * @param context Context needed to open the target activity.
     */
    public void navigateToEducationDetail(Context context) {
        if (context != null) {

        }
    }

    /**
     * Navigates to the profile detail screen.
     *
     * @param context Context needed to open the target activity.
     */
    public void navigateToProjectDetail(Context context) {
        if (context != null) {

        }
    }
}
