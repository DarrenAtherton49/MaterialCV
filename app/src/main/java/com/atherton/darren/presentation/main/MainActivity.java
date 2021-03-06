package com.atherton.darren.presentation.main;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;

import com.atherton.darren.R;
import com.atherton.darren.data.experience.Experience;
import com.atherton.darren.presentation.base.BaseActivity;
import com.atherton.darren.presentation.injection.component.DaggerMainActivityComponent;
import com.atherton.darren.presentation.injection.component.MainActivityComponent;
import com.atherton.darren.presentation.injection.module.MainActivityModule;
import com.atherton.darren.presentation.navigation.MainNavigation;
import com.atherton.darren.presentation.biography.BiographyListFragment;
import com.atherton.darren.presentation.experience.ExperienceListFragment;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.BindString;

/**
 * Main activity which holds the top level ViewPager/TabLayout.
 * This is the entry point for the app.
 */
public class MainActivity extends BaseActivity implements MainTabbedView, MainNavigation {

    private MainActivityComponent mainActivityComponent;

    @Inject MainTabbedPresenter mainTabbedPresenter;
    @Inject MainViewPagerAdapter viewPagerAdapter;

    @Bind(R.id.collapsingtoolbarlayout_main) CollapsingToolbarLayout collapsingToolbarLayout;
    @Bind(R.id.toolbar_main) Toolbar toolbar;
    @Bind(R.id.tablayout_main) TabLayout tabLayout;
    @Bind(R.id.viewpager_main) ViewPager viewPager;

    @BindString(R.string.main_tab_biography_title) String biographyTitle;
    @BindString(R.string.main_tab_education_title) String educationTitle;
    @BindString(R.string.main_tab_projects_title) String projectTitle;
    @BindString(R.string.main_tab_experience_title) String experienceTitle;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(this.toolbar);
        collapsingToolbarLayout.setTitleEnabled(false);

        initInjection();
        this.mainActivityComponent.inject(this);

        if (this.viewPager != null) {
            initViewPager(this.viewPager);
            initTabLayout(this.viewPager);
        }

        if (savedInstanceState == null) {
            this.mainTabbedPresenter.init();
        }

        this.mainTabbedPresenter.setView(this);
    }

    @Override protected void onResume() {
        super.onResume();
        this.mainTabbedPresenter.resume();
    }

    @Override protected void onPause() {
        super.onPause();
        this.mainTabbedPresenter.pause();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        this.mainTabbedPresenter.destroy();
    }

    @Override protected int getContentView() {
        return R.layout.activity_main;
    }

    private OnPageChangeListener onPageChangeListener = new OnPageChangeListener() {
        @Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }
        @Override public void onPageSelected(int position) {
            pageSelected(position);
        }
        @Override public void onPageScrollStateChanged(int state) {

        }
    };

    @Override public void pageSelected(int position) {
        if (this.mainTabbedPresenter != null) {
            this.mainTabbedPresenter.onPageSelected(position);
        }
    }

    @Override public void renderHeaderForTab(int position) {
        //todo change colour, circular reveal animation etc.
    }

    private void initInjection() {
        this.mainActivityComponent = DaggerMainActivityComponent.builder()
                .appComponent(getAppComponent())
                .activityModule(getActivityModule())
                .mainActivityModule(new MainActivityModule(this))
                .build();
    }

    private void initViewPager(ViewPager viewPager) {
        this.viewPagerAdapter.addFragment(new BiographyListFragment(), biographyTitle);
        this.viewPagerAdapter.addFragment(new BiographyListFragment(), educationTitle);
        this.viewPagerAdapter.addFragment(new BiographyListFragment(), projectTitle);
        this.viewPagerAdapter.addFragment(new ExperienceListFragment(), experienceTitle);
        viewPager.setAdapter(this.viewPagerAdapter);
        viewPager.addOnPageChangeListener(onPageChangeListener);
    }

    private void initTabLayout(ViewPager viewPager) {
        if (this.tabLayout != null) {
            this.tabLayout.setupWithViewPager(viewPager);
        }
    }

    @Override public void onExperienceItemClicked(final Experience experienceItem) {
        if (this.appNavigator != null) {
            this.appNavigator.navigateToExperienceDetail(this, experienceItem.getId());
        }
    }
}
