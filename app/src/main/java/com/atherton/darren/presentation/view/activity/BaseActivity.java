package com.atherton.darren.presentation.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.atherton.darren.presentation.AndroidApplication;
import com.atherton.darren.presentation.injection.component.AppComponent;
import com.atherton.darren.presentation.navigation.AppNavigator;

import javax.inject.Inject;

import butterknife.ButterKnife;
import timber.log.Timber;

/**
 * Base {@link android.support.v7.app.AppCompatActivity} for the
 * project from which all other activities in the project should extend.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    AppNavigator appNavigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // The activity is being created.
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        ButterKnife.bind(this);
        Timber.d("onCreate()");

        /*
         * App @component injects the AppModule @module into this activity
         */
        getAppComponent().inject(this);
    }

    @Override
    protected void onStart() {
        // The activity is about to become visible.
        super.onStart();
        Timber.d("onStart()");
    }

    @Override
    protected void onResume() {
        // The activity has become visible (it is now "resumed").
        super.onResume();
        Timber.d("onResume()");
    }

    @Override
    protected void onPause() {
        // Another activity is taking focus (this activity is about to be "paused").
        super.onPause();
        Timber.d("onPause()");
    }

    @Override
    protected void onStop() {
        // The activity is no longer visible (it is now "stopped")
        super.onStop();
        Timber.d("onStop()");
    }

    @Override
    protected void onDestroy() {
        // The activity is about to be destroyed.
        super.onDestroy();
        Timber.d("onDestroy()");
    }

    /**
     * Ensures we provide a content view identifier for setContentView()
     */
    protected abstract int getContentView();

    /**
     * Get the Main Application component for injection.
     *
     * @return {@link com.atherton.darren.presentation.injection.component.AppComponent}
     */
    protected AppComponent getAppComponent() {
        return ((AndroidApplication)getApplication()).getAppComponent();
    }
}
