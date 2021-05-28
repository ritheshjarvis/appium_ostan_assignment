package com.training.tests;

import com.training.TestBase;
import com.training.home.Home;
import com.training.slider.Slider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SliderTest extends TestBase {

    public Home home;
    public Slider slider;

    @BeforeClass
    public void init() {
        home = new Home(driver);
        slider = new Slider(driver);
    }

    @Test
    public void sliderTestCase() throws InterruptedException {

        home.goToSliderOption();

        System.out.println("Before Sliding --> ");

        Assert.assertTrue(slider.SliderAction());

    }
}
