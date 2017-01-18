package com.example.justtestapp;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {


    private SharedPreferences sharedPreferences;
    private static final String fileName = "settings";
    private static final String PARAM_HISTORY = "HISTORY";
    private static final String PARAM_JSON = "JSON";

    public Preferences(Context context) {
        sharedPreferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
    }

    public void saveHistory(String history) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PARAM_HISTORY, history);
        editor.apply();
    }

    public String getHistory() {
        return sharedPreferences.getString(PARAM_HISTORY, "");
    }

    public void saveJson(String jsonFromFile) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PARAM_JSON, jsonFromFile);
        editor.apply();
    }

    public String getJson() {
        return sharedPreferences.getString(PARAM_JSON, null);
    }
}
