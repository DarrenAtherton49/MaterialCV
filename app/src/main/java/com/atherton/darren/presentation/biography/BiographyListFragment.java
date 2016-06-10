package com.atherton.darren.presentation.biography;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atherton.darren.R;
import com.atherton.darren.data.biography.Biography;
import com.atherton.darren.presentation.base.BaseFragment;

import butterknife.ButterKnife;

public class BiographyListFragment extends BaseFragment implements BiographyListView {

    public BiographyListFragment() {
        setRetainInstance(true);
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_all_list, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override public void renderBiographyList(Biography userBio) {

    }

    @Override public void showContactButton() {

    }

    @Override public void hideContactButton() {

    }

    @Override public void showError(String message) {

    }

    @Override public void showProgress() {

    }

    @Override public void hideProgress() {

    }

    @Override public void showRetry() {

    }

    @Override public void hideRetry() {

    }

    @Override public Context context() {
        return getActivity().getApplicationContext();
    }
}
