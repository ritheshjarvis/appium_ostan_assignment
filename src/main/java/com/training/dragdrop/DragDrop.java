package com.training.dragdrop;

import com.training.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class DragDrop extends Base {
    public AppiumDriver driver;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Double Tap Me\")")
    @iOSXCUITFindBy(accessibility = "Double Tap Me")
    public static MobileElement button;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "iJava")
    public static MobileElement iJava;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Java")
    public static MobileElement Java;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "inode")
    public static MobileElement inode;
//
//    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(accessibility = "node")
//    public static MobileElement node;
//
//    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(accessibility = "iphp")
//    public static MobileElement iphp;
//
//    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(accessibility = "php")
//    public static MobileElement php;
//
//    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(accessibility = "ireactjs")
//    public static MobileElement ireactjs;
//
//    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(accessibility = "reactjs")
//    public static MobileElement reactjs;
//
//    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(accessibility = "ipython")
//    public static MobileElement ipython;
//
//    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
//    @AndroidFindBy(accessibility = "python")
//    public static MobileElement python;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"DoubleTap Successful\")")
    @iOSXCUITFindBy(accessibility = "DoubleTap Successful")
    public static MobileElement toast;

    public DragDrop(AppiumDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean dragdropAction() throws InterruptedException {

        draganddrop(iJava,Java);

        Thread.sleep(2000);

        try {
            iJava.isDisplayed();
            System.out.println("True");
            return true;

        } catch (WebDriverException e) {
            System.out.println("false");
            return false;

        }

    }



}

