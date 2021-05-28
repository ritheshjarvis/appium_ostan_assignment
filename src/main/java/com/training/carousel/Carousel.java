package com.training.carousel;

import com.training.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.support.PageFactory;

public class Carousel extends Base {

    public AppiumDriver driver;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"assets/first.jpeg\")")
    @AndroidFindBy(accessibility = "assets/first.jpeg")
    public static MobileElement image1;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"assets/second.jpeg\")")
    @AndroidFindBy(accessibility = "assets/first.jpeg")
    public static MobileElement image2;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"assets/third.jpeg\")")
    @AndroidFindBy(accessibility = "assets/second.jpeg")
    public static MobileElement image3;

    public Carousel(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean carouselAction() {

        swipeLeft(image1, 1000);
        swipeLeft(image2, 1000);

        return image3.isDisplayed();
    }

}
