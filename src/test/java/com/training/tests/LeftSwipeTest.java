package com.training.tests;

import com.training.TestBase;
import com.training.home.Home;
import com.training.swipeleft.SwipeLeft;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeftSwipeTest extends TestBase {

    public Home home;
    public SwipeLeft swipeLeft;

    @BeforeClass
    public void init() {
        home = new Home(driver);
        swipeLeft = new SwipeLeft(driver);
    }

    @Test
    public void leftSwipeTestCase() throws InterruptedException {

        home.goToLeftSwipeOption();

        System.out.println("Before Swipe Left --> ");

        Assert.assertTrue(swipeLeft.swipeLeftAction());

    }
}