package com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumDemo {
  public static void main(String[] args) throws Exception {
    // Configura las capacidades de Appium
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "Pixel_4_XL_API_30");
    // capabilities.setCapability("appPackage", "nombre_del_paquete_de_la_aplicación");
    // capabilities.setCapability("appActivity", "nombre_de_la_actividad_principal");
    capabilities.setCapability("automationName", "uiautomator2");

    // Inicia la sesión de Appium
    AppiumDriver<WebElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);

    // Realiza acciones de automatización
    WebElement elemento = driver.findElement(By.id("json-scrolling-panel"));
    elemento.click();

    // Realiza más acciones según tus necesidades

    // Cierra la sesión de Appium
    driver.quit();
  }
}
