package com.training.slider;

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

public class Slider extends Base {
    public AppiumDriver driver;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"0%, 0\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"volume\"]/following-sibling:: XCUIElementTypeOther")
    public static MobileElement volumeControl;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE, iOSXCUITAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\"Slider moved Successful\")")
    @iOSXCUITFindBy(accessibility = "Slider moved Successful")
    public static MobileElement toast;

    public Slider(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean SliderAction() {

        System.out.println(volumeControl.isDisplayed());
        System.out.println("Performing Sliding action");

        TouchAction t = new TouchAction(driver);

        t.tap(PointOption.point(volumeControl.getSize().width,volumeControl.getLocation().y+volumeControl.getSize().height/2)).perform();


        return toast.isDisplayed();
    }

}
