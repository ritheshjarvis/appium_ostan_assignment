package com.training;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Base {
    public AppiumDriver driver;

    public Base(AppiumDriver driver){
        this.driver = driver;
    }

    public void tapGesture(MobileElement element){
        System.out.println("Inside the Base");
        System.out.println(driver);
        new TouchAction<>(driver).tap(TapOptions.tapOptions().withPosition(PointOption.point(element.getCenter().x + element.getSize().width / 2, element.getCenter().y))).perform();
    }

    public void scrolldown(int time){

        System.out.println("Inside the scrolldown base method");
        TouchAction t = new TouchAction(driver);

        Dimension frame =driver.manage().window().getSize();

        int startx = frame.width/2;
        int starty = (int) (frame.height*(0.50));

        int endx = frame.width/2;
        int endy = (int) (frame.height*(0.70));

        System.out.println("startx: ="+startx);
        System.out.println("starty: ="+starty);
        System.out.println("endx: ="+endx);
        System.out.println("endy: ="+endy);

        t.press(PointOption.point(endx,endy))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(time)))
                .moveTo(PointOption.point(startx,starty)).release().perform();
    }

    public void swipeLeft(MobileElement element, int time){

        TouchAction t = new TouchAction(driver);
        Dimension frame =driver.manage().window().getSize();

        int startx = (int) ((element.getSize().width)*0.90);
        int starty =  element.getCenter().y;

        int endx = (int) ((element.getSize().width)*0.20);
        int endy = element.getCenter().y;

        //swipeLeft
        t.press(PointOption.point(startx,starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(time)))
                .moveTo(PointOption.point(endx,endy)).release().perform();


//        t.press(PointOption.point(endx,endy))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
//                .moveTo(PointOption.point(startx,starty)).release().perform();

        System.out.println("Swipe Left was successfull");
    }

    public void draganddrop(MobileElement ele,MobileElement ele1)
    {
        new TouchAction(driver).longPress(PointOption.point(ele.getCenter()))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(ele1.getCenter())).release().perform();

    }
}
