package com.atherton.darren.presentation.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;

import com.atherton.darren.R;
import com.atherton.darren.presentation.injection.component.DaggerMainActivityComponent;
import com.atherton.darren.presentation.injection.component.MainActivityComponent;
import com.atherton.darren.presentation.injection.module.MainActivityModule;
import com.atherton.darren.presentation.view.MainTabbedView;
import com.atherton.darren.presentation.view.adapter.MainViewPagerAdapter;
import com.atherton.darren.presentation.view.fragment.BiographyListFragment;
import com.atherton.darren.presentation.view.fragment.ExperienceListFragment;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.BindDrawable;
import butterknife.BindString;

/**
 * Main activity which holds the top level ViewPager/TabLayout.
 * This is the entry point for the app.
 */
public class MainActivity extends BaseActivity implements MainTabbedView {

    public static final int BIOGRAPHY_LIST_TAB = 0;
    public static final int EDUCATION_LIST_TAB = 1;
    public static final int PROJECT_LIST_TAB = 2;
    public static final int EXPERIENCE_LIST_TAB = 3;

    private MainActivityComponent mainActivityComponent;

    @Inject MainViewPagerAdapter viewPagerAdapter;

    @Bind(R.id.toolbar_main) Toolbar toolbar;
    @Bind(R.id.tablayout_main) TabLayout tabLayout;
    @Bind(R.id.viewpager_main) ViewPager viewPager;

    @BindString(R.string.main_tab_biography_title) String biographyTitle;
    @BindString(R.string.main_tab_education_title) String educationTitle;
    @BindString(R.string.main_tab_projects_title) String projectTitle;
    @BindString(R.string.main_tab_experience_title) String experienceTitle;

    @BindDrawable(R.drawable.ic_person) Drawable biographyIcon;
    @BindDrawable(R.drawable.ic_school) Drawable educationIcon;
    @BindDrawable(R.drawable.ic_book) Drawable projectIcon;
    @BindDrawable(R.drawable.ic_work) Drawable experienceIcon;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(this.toolbar);

        initInjection();
        this.mainActivityComponent.inject(this);

        if (this.viewPager != null) {
            initViewPager(this.viewPager);
            initTabLayout(this.viewPager);
            setTitleForPosition(BIOGRAPHY_LIST_TAB); //todo change this to get last used fragment index instead of always 0
        }
    }

    @Override protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override public OnPageChangeListener onPageChanged() {
        return new OnPageChangeListener() {
            @Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override public void onPageSelected(int position) {
                setTitleForPosition(position);
            }
            @Override public void onPageScrollStateChanged(int state) {

            }
        };
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
        viewPager.addOnPageChangeListener(onPageChanged());
    }

    private void initTabLayout(ViewPager viewPager) {
        if (this.tabLayout != null) {
            this.tabLayout.setupWithViewPager(viewPager);
            setTabIcon(BIOGRAPHY_LIST_TAB, biographyIcon);
            setTabIcon(EDUCATION_LIST_TAB, educationIcon);
            setTabIcon(PROJECT_LIST_TAB, projectIcon);
            setTabIcon(EXPERIENCE_LIST_TAB, experienceIcon);
        }
    }

    private void setTabIcon(int tabIndex, Drawable icon) {
        TabLayout.Tab tab = tabLayout.getTabAt(tabIndex);
        if (tab != null) {
            tab.setIcon(icon);
        }
    }

    private void setTitleForPosition(int position) {
        if (this.viewPagerAdapter != null) {
            CharSequence title = this.viewPagerAdapter.getTitleForPosition(position);
            if (title != null) {
                setTitle(title);
            }
        }
    }
}
