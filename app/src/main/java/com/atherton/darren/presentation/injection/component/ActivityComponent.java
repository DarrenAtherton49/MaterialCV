package com.atherton.darren.presentation.injection.component;

import android.support.v7.app.AppCompatActivity;

import com.atherton.darren.presentation.injection.module.ActivityModule;
import com.atherton.darren.presentation.injection.scope.PerScreen;

import dagger.Component;

/**
 * A module to expose the activity to the graph.
 */
@PerScreen
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    // expose the activity (context) to the sub-graph
    AppCompatActivity activity();
}
