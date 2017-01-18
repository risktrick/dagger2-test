package com.example.justtestapp;


import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LoggerModule {

    @Provides
    @NonNull
    @Singleton
    public Logger provideLogger(){
        return new Logger();
    }

}
