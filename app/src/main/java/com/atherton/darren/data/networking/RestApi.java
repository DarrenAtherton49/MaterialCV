package com.atherton.darren.data.networking;

import android.content.Context;

import com.atherton.darren.data.experience.Experience;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import rx.Observable;


public interface RestApi {

  String BASE_URL = "https://materialcv.firebaseio.com/profile/";

  String GET_EXPERIENCE_LIST = "experience.json";

  /**
   * Retrieves an {@link rx.Observable} which will emit a List of {@link com.atherton.darren.data.experience.Experience}.
   */
  @GET(GET_EXPERIENCE_LIST)
  Observable<List<Experience>> getExperiences();

  class Factory {

    public static RestApi create(Context context) {

      Gson gson = new GsonBuilder().create();

      Retrofit retrofit = new Retrofit.Builder()
              .baseUrl(RestApi.BASE_URL)
              .addConverterFactory(GsonConverterFactory.create(gson))
              .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
              .build();
      return retrofit.create(RestApi.class);
    }
  }
}
