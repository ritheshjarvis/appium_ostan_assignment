package com.training;

import com.training.utils.PropertyReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static AppiumDriver driver;

//    @BeforeTest
    @BeforeClass
//    @AfterMethod(alwaysRun = true)
    public void setup() throws IOException {

        System.out.println("Inside the Before Test");

        if (getProperties().getProperty("PLATFORM_NAME").equalsIgnoreCase("ANDROID")) {
            System.out.println("Inside Android");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getCapabilities());
            System.out.println("After Android");
            System.out.println(driver);

        } else if (getProperties().getProperty("PLATFORM_NAME").equalsIgnoreCase("IOS")) {
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), getCapabilities());
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterTest
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public Properties getProperties() throws IOException {
        return PropertyReader.getInstance().readProperty("src/main/resources/config.properties");
    }

    public DesiredCapabilities getCapabilities() throws IOException {

        DesiredCapabilities cap = new DesiredCapabilities();

        if (getProperties().getProperty("PLATFORM_NAME").equalsIgnoreCase("ANDROID")) {
            cap.setCapability(CapabilityType.PLATFORM_NAME, getProperties().getProperty("PLATFORM_NAME"));
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getProperties().getProperty("APP_PACKAGE"));
            cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getProperties().getProperty("APP_ACTIVITY"));
        } else if (getProperties().getProperty("setup").equalsIgnoreCase("IOS")) {
            System.out.println("IOS Capabilities");
        } else {
            cap = null;
        }
        return cap;
    }

}
