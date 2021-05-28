package com.training.doubleTap;

import com.training.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.support.PageFactory;

public class DoubleTap extends Base {
    public AppiumDriver driver;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Double Tap Me\")")
    @iOSXCUITFindBy(accessibility = "Double Tap Me")
    public static MobileElement button;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"DoubleTap Successful\")")
    @iOSXCUITFindBy(accessibility = "DoubleTap Successful")
    public static MobileElement toast;

    public DoubleTap(AppiumDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean doubletapAction(){
        new TouchAction<>(driver).tap(TapOptions.tapOptions().withElement(ElementOption.element(button)).withTapsCount(2)).perform();
        return toast.isDisplayed();
    }

}
