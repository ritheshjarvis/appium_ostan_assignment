package com.training.tests;

import com.training.TestBase;
import com.training.home.Home;
import com.training.scroll.Scroll;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollTest extends TestBase {

    public Home home;
    public Scroll scroll;

    @BeforeClass
    public void init() {
        home = new Home(driver);
        scroll = new Scroll(driver);
    }

    @Test
    public void scrollTestCase() throws InterruptedException {

        home.goToScrollOption();

        System.out.println("Before Scrolling --> ");
        Thread.sleep(2000);
        Assert.assertTrue(scroll.scrollAction());

    }
}
