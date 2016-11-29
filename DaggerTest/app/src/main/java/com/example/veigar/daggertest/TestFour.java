package com.example.veigar.daggertest;

import javax.inject.Inject;

/**
 * Created by Veigar on 16/11/29.
 */

public class TestFour implements ITestFour {

    @Inject
    public TestFour(){

    }

    @Override
    public void printTestFour() {
        System.out.println("TestFour");
    }
}
