package com.training.tests;

import com.training.TestBase;
import com.training.carousel.Carousel;
import com.training.home.Home;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CarouselTest extends TestBase {

    public Home home;
    public Carousel carousel;

    @BeforeClass
    public void init(){
        home = new Home(driver);
        carousel = new Carousel(driver);
    }

    @Test
    public void carouselTestCase() throws InterruptedException {

        home.goToCarouselOption();

        System.out.println("Before Clicking --> ");

        Assert.assertTrue(carousel.carouselAction());

    }
}