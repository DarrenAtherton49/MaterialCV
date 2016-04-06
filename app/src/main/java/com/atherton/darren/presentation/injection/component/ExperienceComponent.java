/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.atherton.darren.presentation.injection.component;

import com.atherton.darren.presentation.injection.module.ExperienceModule;
import com.atherton.darren.presentation.injection.scope.PerActivity;
import com.atherton.darren.presentation.view.fragment.ExperienceListFragment;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = {ExperienceModule.class})
public interface ExperienceComponent {
  void inject(ExperienceListFragment experienceListFragment);
  // todo inject(ExperienceDetailFragment experienceDetailFragment);
}
