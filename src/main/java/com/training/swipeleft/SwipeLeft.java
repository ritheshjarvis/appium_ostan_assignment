package com.training.swipeleft;

import com.training.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SwipeLeft extends Base {

    public AppiumDriver driver;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Lisa\")")
    public static MobileElement firstmsg;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Chat deleted Successful\")")
    @iOSXCUITFindBy(accessibility = "Chat was deleted Successful")
    public static MobileElement toast;

    public SwipeLeft(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean swipeLeftAction() throws InterruptedException {

        swipeLeft(firstmsg, 1000);

        System.out.println(toast.isDisplayed());

        return toast.isDisplayed();
    }

}
