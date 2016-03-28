package com.atherton.darren.presentation.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atherton.darren.R;
import com.atherton.darren.data.entity.Bio;
import com.atherton.darren.presentation.view.BiographyListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BiographyListFragment extends BaseFragment implements BiographyListView {

    @Bind(R.id.recyclerview_all) RecyclerView recyclerView;

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




    @Override public void renderBiographyList(Bio userBio) {

    }

    @Override public void showContactButton() {

    }

    @Override public void hideContactButton() {

    }

    @Override public void showError(String message) {

    }

    @Override public void showProgess() {

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
