package com.cydeo.tests;

import com.cydeo.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;

public class SwaglabTest {
    @Test
    public void startUpTest() throws InterruptedException {
        AppiumDriver<MobileElement> driver = Driver.getDriver();

        System.out.println(driver.getDeviceTime());

        driver.findElement(MobileBy.AccessibilityId("test-Username")).sendKeys("standard_user");
        driver.findElement(MobileBy.AccessibilityId("test-Password")).sendKeys("secret_sauce");
        driver.findElement(MobileBy.AccessibilityId("test-LOGIN")).click();

        // we will scroll down and verify that we have "policy" text

        Thread.sleep(4000);

        ((AndroidDriver)driver).findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Policy\"));");



    }
}
