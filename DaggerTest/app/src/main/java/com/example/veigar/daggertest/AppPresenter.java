package com.example.veigar.daggertest;

import javax.inject.Inject;

/**
 * Created by Veigar on 16/11/29.
 */
public class AppPresenter {

    @Inject
    TestTwo testTwo;
    private ITestFour testFour;

    @Inject
    public AppPresenter(){
        testFour = DaggerApplication.getActivityComponent().getTestFour();
    }

    public void printAppPresenter(){
        testTwo.printTestTwo();
        System.out.println("AppPresenter");
        testFour.printTestFour();
    }

}
