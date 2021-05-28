package com.training.home;

import com.training.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.PageFactory;

public class Home extends Base {

    public AppiumDriver driver;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Tap\")")
    @AndroidFindBy(accessibility = "Tap")
    public static MobileElement tap;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"DoubleTap\")")
    @iOSXCUITFindBy(accessibility = "DoubleTap")
    public static MobileElement doubletap;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Vertical Swipe\")")
    @AndroidFindBy(accessibility = "Vertical Swipe")
    @iOSXCUITFindBy(accessibility = "Vertical Swipe")
    public static MobileElement scroll;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Swipe Left\")")
    @iOSXCUITFindBy(accessibility = "Swipe Left")
    public static MobileElement swipe;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Long Press\")")
    @iOSXCUITFindBy(accessibility = "Long Press")
    public static MobileElement longpress;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Slider\")")
    @iOSXCUITFindBy(accessibility = "Slider")
    public static MobileElement slider;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Carousel")
    public static MobileElement carousel;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Drag n Drop")
    public static MobileElement dragdrop;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Pinch Zoom")
    public static MobileElement pinchzoom;

    public Home(AppiumDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void goToTapOption(){
        System.out.println("Before Tap");
        tap.click();
    }

    public void goToDoubleTap(){
        System.out.println("Before DoubleTap");
        doubletap.click();
    }

    public void goToScrollOption(){
        scroll.click();
    }

    public void goToLeftSwipeOption(){
        swipe.click();
    }

    public void goToLongPressOption(){
        longpress.click();
    }

    public void goToSliderOption(){
        slider.click();
    }

    public void goToCarouselOption() throws InterruptedException {

        scrolldown(700);

        carousel.click();
    }

    public void goTodragdropOption() throws InterruptedException {
        scrolldown(350);
        dragdrop.click();
    }
    public void goTopinchzoomOption() throws InterruptedException {

        scrolldown(700);

        pinchzoom.click();
    }
}
