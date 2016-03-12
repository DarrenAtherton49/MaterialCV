package com.atherton.darren.presentation.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Base activity for the project from which all other activities in the
 * project should extend.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // The activity is being created.
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
    }

    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
    }

    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
    }

    /**
     * Ensures we provide a content view identifier for setContentView()
     */
    protected abstract int getContentView();

    // todo inject activity component - look at base activity in example
}
