package com.example.veigar.daggertest;

import javax.inject.Inject;

/**
 * Created by Veigar on 16/11/29.
 */

public class TestFive implements ITestFour{
    @Inject
    public TestFive(){

    }

    @Override
    public void printTestFour() {
        System.out.println("TestFive");
    }
}
