package com.example.veigar.daggertest;

import android.app.Application;

/**
 * Created by Veigar on 16/11/29.
 */

public class DaggerApplication extends Application {
    private static AppComponent appComponent;
    private static ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
        activityComponent = DaggerActivityComponent.builder()
                .appComponent(appComponent)
                .activityModule(new ActivityModule())
                .build();
    }

    public static AppComponent getAppComponent(){
        return appComponent;
    }

    public static ActivityComponent getActivityComponent(){
        return activityComponent;
    }
}
