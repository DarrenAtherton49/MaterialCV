package com.atherton.darren.presentation.experience;

import com.atherton.darren.data.experience.Experience;
import com.atherton.darren.presentation.base.Presenter;

public interface ExperienceListPresenter extends Presenter {

    void setView(ExperienceListView experienceListView);
    void onExperienceClicked(Experience experience);
}
