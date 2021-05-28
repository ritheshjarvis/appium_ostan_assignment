package com.training.scroll;

import com.training.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Scroll extends Base {

    public AppiumDriver driver;

//    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Gagan\")")
//    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Jane\")")
//    @AndroidFindBy(accessibility = "Jane 5987461358")
    @iOSXCUITFindBy(accessibility = "Gagan 7845961234\n")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label CONTAINS \"Gagan\"`]")
    public static MobileElement lastelement;

    public Scroll(AppiumDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean scrollAction() throws InterruptedException {

        scrolldown(200);

        System.out.println(lastelement.isDisplayed());

        return lastelement.isDisplayed();
    }
}
