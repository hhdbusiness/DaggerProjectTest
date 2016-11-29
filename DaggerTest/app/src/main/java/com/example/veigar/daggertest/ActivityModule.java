package com.example.veigar.daggertest;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Veigar on 16/11/29.
 */
@Module
public class ActivityModule {
    @Provides
    @Named("TestFour")
    ITestFour getTestFour(TestFour testFour){
        return testFour;
    }

    @Provides
    @Named("TestFive")
    ITestFour getTestFive(TestFive testFive){
        return testFive;
    }
}
