package com.atherton.darren.presentation.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.atherton.darren.presentation.AndroidApplication;
import com.atherton.darren.presentation.injection.component.AppComponent;
import com.atherton.darren.presentation.injection.module.ActivityModule;

/**
 * Base {@link android.support.v4.app.Fragment} for the
 * project from which all other Fragments should extend.
 */
public abstract class BaseFragment extends Fragment {

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
         * App @component injects the AppModule @module into this activity
         */
        getAppComponent().inject(this);
    }

    /**
     * Get the Main Application component for injection.
     *
     * @return {@link com.atherton.darren.presentation.injection.component.AppComponent}
     */
    protected AppComponent getAppComponent() {
        return ((AndroidApplication)getAct().getApplication()).getAppComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(getAct());
    }

    private AppCompatActivity getAct() {
        return ((AppCompatActivity)getActivity());
    }
}
