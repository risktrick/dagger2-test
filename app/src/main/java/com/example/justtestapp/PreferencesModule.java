package com.example.justtestapp;


import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PreferencesModule {

    @Provides
    @NonNull
    @Singleton
    public Preferences providePreferences(Context context){
        return new Preferences(context);
    }
}
