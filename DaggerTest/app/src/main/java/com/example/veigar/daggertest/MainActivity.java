package com.example.veigar.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    ITestOne testOne;
    @Inject
    TestTwo testTwo;
    @Inject
    TestThree testThree;
    @Inject
    @Named("TestFour")
    ITestFour iTestFour;
    @Inject
    @Named("TestFive")
    ITestFour iTestFive;
    @Inject
    AppPresenter appPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerApplication.getActivityComponent().inject(this);
//        DaggerActivityComponent.builder()
//                .appComponent(appComponent)
//                .baseActivityModule(new BaseActivityModule(activity))
//                .build();
        setContentView(R.layout.activity_main);
        testOne.printTestOne();
        testTwo.printTestTwo();
        testThree.printTestThree();
        iTestFour.printTestFour();
        iTestFive.printTestFour();
        appPresenter.printAppPresenter();
    }
}
