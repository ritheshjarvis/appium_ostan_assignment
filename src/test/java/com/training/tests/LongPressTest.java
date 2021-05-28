package com.training.tests;

import com.training.TestBase;
import com.training.home.Home;
import com.training.longpress.LongPress;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LongPressTest extends TestBase {

    public Home home;
    public LongPress longPress;

    @BeforeClass
    public void init(){
        home = new Home(driver);
        longPress = new LongPress(driver);
    }

    @Test
    public void longPressTestCase() throws InterruptedException {

        home.goToLongPressOption();

        System.out.println("Before LongPress --> ");

        Assert.assertTrue(longPress.longPressAction());

    }
}