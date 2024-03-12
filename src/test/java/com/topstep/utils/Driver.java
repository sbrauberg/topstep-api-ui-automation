package com.topstep.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

import static com.topstep.utils.ConfigurationReader.getProperty;

public class Driver {


    private Driver() {
    }


    private static final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();


    public static WebDriver getDriver() {

        if (driverPool.get() == null) {

            synchronized (Driver.class) {

                String browserType = getProperty("browser");


                switch (browserType) {
                    case "chrome":
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments();
                        chromeOptions.addArguments("--disable-blink-features");
                        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
                        chromeOptions.addArguments("--incognito");
                        driverPool.set(new ChromeDriver(chromeOptions));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        firefoxOptions.addArguments("--disable-blink-features");
                        firefoxOptions.addArguments("--disable-blink-features=AutomationControlled");
                        firefoxOptions.addArguments("--incognito");
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "chromeSSL":

                        ChromeOptions capability = new ChromeOptions();
                        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
                        driverPool.set(new ChromeDriver(capability));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;

                }
            }
        }

        return driverPool.get();


    }


    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }


}
