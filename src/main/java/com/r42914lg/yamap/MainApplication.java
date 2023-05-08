package com.r42914lg.yamap;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class MainApplication extends Application {
    /**
     * Replace "your_api_key" with a valid developer key.
     * You can get it at the https://developer.tech.yandex.ru/ website.
     */

    @Override
    public void onCreate() {
        super.onCreate();
        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(getResources().getString(R.string.api_key));
    }
}
