package com.example.veigar.daggertest;

import javax.inject.Inject;

/**
 * Created by Veigar on 16/11/29.
 */

@ForApp
public class TestOne implements ITestOne {

    @Inject
    public TestOne(){

    }

    @Override
    public void printTestOne() {
        System.out.println("TestOne");
    }
}
