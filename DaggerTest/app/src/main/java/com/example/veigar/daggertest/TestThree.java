package com.example.veigar.daggertest;

import javax.inject.Inject;

/**
 * Created by Veigar on 16/11/29.
 */
@ForActivity
public class TestThree {
    @Inject
    public TestThree(){

    }
    public void printTestThree(){
        System.out.println("TestThree");
    }
}
