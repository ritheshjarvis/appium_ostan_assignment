package com.training.tests;

import com.training.TestBase;
import com.training.home.Home;
import com.training.tap.Tap;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TapTest extends TestBase {

    public Tap tap;
    public Home home;

    @BeforeClass
    public void init(){
        tap = new Tap(driver);
        home = new Home(driver);
    }

    @Test
    public void tapTestCase() throws InterruptedException {

        home.goToTapOption();

        System.out.println("Before Clicking --> ");

        Assert.assertTrue(tap.tapAction());

    }
}