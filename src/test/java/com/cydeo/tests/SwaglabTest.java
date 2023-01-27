package com.cydeo.tests;

import com.cydeo.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;

public class SwaglabTest {
    @Test
    public void startUpTest(){
        AppiumDriver<MobileElement> driver = Driver.getDriver();
    }
}
