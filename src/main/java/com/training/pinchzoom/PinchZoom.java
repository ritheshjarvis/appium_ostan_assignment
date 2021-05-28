package com.training.pinchzoom;

import com.training.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class PinchZoom extends Base {
    public AppiumDriver driver;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "dog")
    public static MobileElement dogImage;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Zoom in was Successful\")")
    public static MobileElement toast;

    public PinchZoom(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean pinchzoomAction() {
        System.out.println("Inside the Pinch zoom action");

        TouchAction action1 = new TouchAction(driver);
        TouchAction action2 = new TouchAction(driver);

//        action1.press(PointOption.point(dogImage.getCenter().x + 10, dogImage.getCenter().y))
//                .waitAction(WaitOptions.waitOptions((Duration.ofMillis(2000)))
//                        .moveTo(PointOption.point(dogImage.getCenter().x + 10, dogImage.getCenter().y + 100)).release();

        action1.press(PointOption.point(dogImage.getCenter().x + 10,dogImage.getCenter().y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(dogImage.getCenter().x + 10,dogImage.getCenter().y + 100)).release();

        action2.press(PointOption.point(dogImage.getCenter().x - 10,dogImage.getCenter().y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(dogImage.getCenter().x - 10,dogImage.getCenter().y - 100)).release();

        MultiTouchAction multi = new MultiTouchAction(driver);

        multi.add(action1).add(action2).perform();

        return toast.isDisplayed();
    }

}
