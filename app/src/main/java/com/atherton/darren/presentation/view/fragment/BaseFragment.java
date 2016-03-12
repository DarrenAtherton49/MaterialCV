package com.atherton.darren.presentation.view.fragment;

import android.support.v4.app.Fragment;

import com.atherton.darren.presentation.navigation.AppNavigator;

import javax.inject.Inject;

/**
 * Base {@link android.support.v4.app.Fragment} for the
 * project from which all other Fragments should extend.
 */
public abstract class BaseFragment extends Fragment {

    @Inject
    AppNavigator appNavigator;


}
