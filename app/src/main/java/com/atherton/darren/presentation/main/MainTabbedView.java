package com.atherton.darren.presentation.main;

/**
 * The view for implementing the main class in which the top-level content
 * is placed in the form of a {@link android.support.design.widget.TabLayout}
 * and {@link android.support.v4.view.ViewPager}
 */
public interface MainTabbedView {

    void pageSelected(int position);
    void renderHeaderForTab(int position);
}
