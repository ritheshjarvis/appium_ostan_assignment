package com.training.tests;

import com.training.TestBase;
import com.training.doubleTap.DoubleTap;
import com.training.home.Home;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleTapTest extends TestBase {

    public Home home;
    public DoubleTap doubleTap;

    @BeforeClass
    public void init(){
        home = new Home(driver);
        doubleTap = new DoubleTap(driver);
    }

    @Test
    public void doubleTapTestCase() throws InterruptedException {

        home.goToDoubleTap();
        System.out.println("Before Clicking --> ");
        Assert.assertTrue(doubleTap.doubletapAction());

    }
}
