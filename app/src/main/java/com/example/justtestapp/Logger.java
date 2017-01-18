package com.example.justtestapp;


import android.util.Log;

public class Logger {

    final String TAG = "just_tag";

    void log(String s){
        Log.e(TAG, s);
    }
}
