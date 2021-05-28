package com.training.longpress;

import com.training.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LongPress extends Base {
    public AppiumDriver driver;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"image\")")
    @iOSXCUITFindBy(accessibility = "image")
    public static MobileElement img;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Close\")")
    @iOSXCUITFindBy(accessibility = "Close")
    public static MobileElement close;

    public LongPress(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean longPressAction() {

        new TouchAction(driver).longPress(PointOption.point(img.getCenter())).release().perform();

        return close.isDisplayed();
    }

}
