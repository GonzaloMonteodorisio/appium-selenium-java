package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;
import com.appium.ConfigurationAppium;

public class AbrirNoti {
    public static void main(String[] args) throws InterruptedException, IOException {

        AndroidDriver<AndroidElement> driver = AndroidDriverManager.getDriver();

        // Objetivo: Escribir un script que abra el panel de notificaciones.
        driver.openNotifications();

        // Cierra el driver cuando ya no lo necesites
        AndroidDriverManager.cerrarDriver();
    }
}