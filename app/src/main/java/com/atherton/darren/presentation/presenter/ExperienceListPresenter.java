package com.atherton.darren.presentation.presenter;

import com.atherton.darren.data.entity.Experience;
import com.atherton.darren.presentation.view.ExperienceListView;

public interface ExperienceListPresenter extends Presenter {

    void setView(ExperienceListView experienceListView);
    void onExperienceClicked(Experience experience);
}
