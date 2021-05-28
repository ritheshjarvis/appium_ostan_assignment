package com.training.tests;

import com.training.TestBase;
import com.training.home.Home;
import com.training.pinchzoom.PinchZoom;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PinchZoomTest extends TestBase {

    public Home home;
    public PinchZoom pinchzoom;

    @BeforeClass
    public void init(){
        home = new Home(driver);
        pinchzoom = new PinchZoom(driver);
    }

    @Test
    public void pinchzoomTestCase() throws InterruptedException {

        home.goTopinchzoomOption();

        System.out.println("Before Pinch Zoom --> ");

        Assert.assertTrue(pinchzoom.pinchzoomAction());

    }
}
