package com.atherton.darren.presentation.view.activity;

import android.os.Bundle;

import com.atherton.darren.R;

/**
 * Main activity which holds the top level ViewPager/TabLayout.
 * This is the entry point for the app.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }
}
