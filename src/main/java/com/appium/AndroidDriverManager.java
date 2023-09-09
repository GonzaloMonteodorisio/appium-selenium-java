package com.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import com.appium.ConfigurationAppium;


public class AndroidDriverManager {
    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> getDriver() {
        if (driver == null) {
            // Configura las capacidades del dispositivo Android utilizando la clase ConfiguracionAppium
            DesiredCapabilities capabilities = ConfigurationAppium.getConfiguracion();
            try {
                driver = new AndroidDriver<>(new URL("http://172.30.64.1:4723"), capabilities);
            } catch (Exception e) {
                e.printStackTrace();
                // Maneja las excepciones según tus necesidades
            }
        }
        return driver;
    }

    public static void cerrarDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
