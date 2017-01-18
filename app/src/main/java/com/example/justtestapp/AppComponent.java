package com.example.justtestapp;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {ContextModule.class, LoggerModule.class, PreferencesModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
