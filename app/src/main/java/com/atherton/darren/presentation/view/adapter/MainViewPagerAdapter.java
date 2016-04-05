package com.atherton.darren.presentation.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    @Inject
    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override public int getCount() {
        return fragmentList.size();
    }

    @Override public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    public void addFragment(Fragment fragment, String fragmentTitle) {
        fragmentList.add(fragment);
        fragmentTitleList.add(fragmentTitle);
    }

    public CharSequence getTitleForPosition(int position) {
        return fragmentTitleList.get(position);
    }
}
