package com.example.veigar.daggertest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Veigar on 16/11/29.
 */
@ForApp
@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {
        ITestOne getITestOne();
}
