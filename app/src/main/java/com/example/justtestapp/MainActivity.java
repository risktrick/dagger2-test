package com.example.justtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Logger logger;

    @Inject
    Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainApplication.getComponent().inject(this);

        logger.log(preferences.getHistory());
        preferences.saveHistory("hello dagger2!");
        logger.log(preferences.getHistory());

    }


}
