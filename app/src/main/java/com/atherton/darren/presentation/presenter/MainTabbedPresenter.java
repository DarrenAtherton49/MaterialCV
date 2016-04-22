package com.atherton.darren.presentation.presenter;

import com.atherton.darren.presentation.view.MainTabbedView;

public interface MainTabbedPresenter extends Presenter {

    void setView(MainTabbedView mainTabbedView);
    void onPageSelected(int position);
}
