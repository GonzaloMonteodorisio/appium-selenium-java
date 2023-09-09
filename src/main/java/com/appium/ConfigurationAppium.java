package com.appium;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ConfigurationAppium {
    public static DesiredCapabilities getConfiguracion() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
        return capabilities;
    } 
}
