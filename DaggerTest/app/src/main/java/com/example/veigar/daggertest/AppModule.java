package com.example.veigar.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Veigar on 16/11/29.
 */
@Module
public class AppModule {
    @Provides
    public ITestOne getITestOne(TestOne testOne){
        return testOne;
    }
}
