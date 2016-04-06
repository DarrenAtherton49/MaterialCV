package com.atherton.darren.presentation.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atherton.darren.R;
import com.atherton.darren.data.entity.Experience;
import com.atherton.darren.presentation.injection.component.ExperienceComponent;
import com.atherton.darren.presentation.presenter.ExperienceListPresenter;
import com.atherton.darren.presentation.view.ExperienceListView;
import com.atherton.darren.presentation.view.adapter.ExperienceListAdapter;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ExperienceListFragment extends BaseFragment implements ExperienceListView {

    /**
     * Interface for listening for click events on the Experience list
     */
    public interface ExperienceListListener {
        void onExperienceItemClicked(final Experience experienceItem);
    }

    @Inject ExperienceListPresenter experienceListPresenter;
    @Inject ExperienceListAdapter experienceListAdapter;

    @Bind(R.id.recyclerview_all) RecyclerView recyclerView;

    private ExperienceComponent experienceComponent;

    private ExperienceListListener experienceListListener;

    public ExperienceListFragment() {
        setRetainInstance(true);
    }

    @Override public void onAttach(Context activity) {
        super.onAttach(activity);
        if (activity instanceof ExperienceListListener) {
            this.experienceListListener = (ExperienceListListener) activity;
        }
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // todo inject component here
        initializeInjector();
        this.experienceComponent.inject(this);
    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_all_list, container, false);
        ButterKnife.bind(this, view);
        initRecyclerView();
        return view;
    }

    @Override public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.experienceListPresenter.setView(this);
        if (savedInstanceState == null) {
            this.loadUserList();
        }
    }

    @Override public void onResume() {
        super.onResume();
        this.experienceListPresenter.resume();
    }

    @Override public void onPause() {
        super.onPause();
        this.experienceListPresenter.pause();
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        recyclerView.setAdapter(null);
        ButterKnife.unbind(this);
    }

    @Override public void onDestroy() {
        super.onDestroy();
        this.experienceListPresenter.destroy();
    }

    @Override public void onDetach() {
        super.onDetach();
        this.experienceListPresenter = null;
    }

    @Override public void renderExperienceList(List<Experience> experienceList) {
        if (experienceList != null) {
            this.experienceListAdapter.setExperienceList(experienceList);
        }
    }

    @Override public void viewExperience(Experience experience) {
        if (this.experienceListPresenter != null) {
            this.experienceListListener.onExperienceItemClicked(experience);
        }
    }

    @Override public void showContactButton() {

    }

    @Override public void hideContactButton() {

    }

    @Override public void showError(String errorMessage) {

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
        return this.getActivity().getApplicationContext();
    }

    private void loadUserList() {
        this.experienceListPresenter.init();
    }

    private void initRecyclerView() {
        this.experienceListAdapter.setOnItemClickListener(onItemClickListener);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(context()));
        this.recyclerView.setAdapter(experienceListAdapter);
    }

    /*
     * Click listener to register clicks on items in the adapter.
     * Each click passes the corresponding Experience into the presenter.
     */
    private ExperienceListAdapter.OnItemClickListener onItemClickListener =
            new ExperienceListAdapter.OnItemClickListener() {
                @Override public void onExperienceItemClicked(Experience experience) {
                    if (ExperienceListFragment.this.experienceListPresenter != null && experience != null) {
                        ExperienceListFragment.this.experienceListPresenter.onExperienceClicked(experience);
                    }
                }
            };

    private void initializeInjector() {
//        this.experienceComponent = DaggerExperienceComponent.builder()
//                .
//                .build();
    }
}
