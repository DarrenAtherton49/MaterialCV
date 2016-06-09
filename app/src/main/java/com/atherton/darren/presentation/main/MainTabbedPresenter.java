package com.atherton.darren.presentation.main;

import com.atherton.darren.presentation.base.Presenter;

public interface MainTabbedPresenter extends Presenter {

    void setView(MainTabbedView mainTabbedView);
    void onPageSelected(int position);
}
