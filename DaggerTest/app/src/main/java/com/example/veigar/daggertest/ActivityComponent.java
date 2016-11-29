package com.example.veigar.daggertest;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by Veigar on 16/11/29.
 */
@ForActivity
@Component(
        dependencies = {
                AppComponent.class
        },
        modules = {
                ActivityModule.class
        }
)
public interface ActivityComponent {
        void inject(MainActivity mainActivity);

        @Named("TestFour")
        ITestFour getTestFour();
}
