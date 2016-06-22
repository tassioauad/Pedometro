package com.tassioauad.pedometro.dagger;

import android.content.Context;

import com.tassioauad.pedometro.model.api.ActivityRecognizer;
import com.tassioauad.pedometro.model.api.impl.ActivityRecognizerImpl;
import com.tassioauad.pedometro.model.api.LocationCapturer;
import com.tassioauad.pedometro.model.api.impl.LocationCapturerImpl;
import com.tassioauad.pedometro.model.service.Tracker;
import com.tassioauad.pedometro.model.service.TrackerImpl;

import dagger.Module;
import dagger.Provides;

@Module(library = true, includes = AppModule.class)
public class ApiModule {

    @Provides
    public ActivityRecognizer provideActivityRecognizer(Context context) {
        return new ActivityRecognizerImpl(context);
    }

    @Provides
    public LocationCapturer provideLocationCapturer(Context context) {
        return new LocationCapturerImpl(context);
    }

    @Provides
    public Tracker provideTracker(Context context) {
        return new TrackerImpl(context);
    }

}