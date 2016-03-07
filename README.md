# Material CV - Android
A simple app to store and display my CV, implemented using MVP architecture.

## Libraries
 
Libraries used:

- [Android Support library](http://developer.android.com/tools/support-library/index.html) (RecyclerView etc.)
- [RxJava](https://github.com/ReactiveX/RxJava) (JVM reactive extensions)
- [RxAndroid](https://github.com/ReactiveX/RxAndroid) (RxJava Android bindings)
- [Butterknife](https://github.com/JakeWharton/butterknife) (field and method binding)
- [Icepick](https://github.com/frankiesardo/icepick) (saving/restoring instance state)
- [Retrofit](http://square.github.io/retrofit) (API consumption)
- [OkHttp](https://github.com/square/okhttp) (HTTP client)
- [Dagger 2](http://google.github.io/dagger) (dependency injection)
- [Robolectric](https://github.com/robolectric/robolectric) (unit testing)
- [Mockito](http://mockito.org/) (unit test mocking)
- [Espresso](https://google.github.io/android-testing-support-library/docs/espresso/index.html) (UI testing)
- [Glide](https://github.com/bumptech/glide) (image loading)

## Usage

### Folder Structure

The folder structure used in this app is based on the [Ribot app](https://github.com/ribot/ribot-app-android) structure.
The app has the following structure:

- **data** - represents the entire data layer.
Includes the following packages (and single files e.g. to handle bus events):
  -  **entities** - all domain-specific java objects. E.g. objects serialized via Retrofit.
  -  **local** - helper classes for interacting with local storage. E.g. DatabaseService, PreferencesService.
  -  **server** - helper classes for interacting with remote API's. E.g. Retrofit, Parse.
  -  **repositories** - domain-specific data managers containing RxJava operators
  to interact with classes in 'local' and 'server'. Example method: getUserByName().
  Each method is typically structured as an interface and implementation.
- **injection** - dependency injection using [Dagger](http://google.github.io/dagger)
modules/components.
- **service** - a class for each of the background services, e.g. beacons, notifications.
- **ui** - the presentation layer. Each folder represents an MVP candidate -
a screen in the app represented by a fragment/activity (the view), a view interface and a presenter.
  -  **base** - a set of base classes from which MVP candidates can inherit.
  -  **main** - a main activity (incorporating TabLayout).
  -  **mvpcandidate1** - E.g. sign in screen.
- **util** - any util classes, e.g. for handling dates, strings, dialogs.

## Licence

```
Copyright 2016 Darren Atherton

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
