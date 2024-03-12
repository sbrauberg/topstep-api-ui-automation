package com.topstep.stepdefinitions.ui;

import com.topstep.pages.LandingPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

import static com.topstep.utils.Driver.*;

public class Hooks {
    LandingPage landingPage = new LandingPage();

    @Before("@ui")
    public void setUp() {
        WebDriver driver = getDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        landingPage.navigateToLandingPage();//might need to remove it out of @Before method
    }


    @After("@ui")
    public void tearDown() {
        closeDriver();
    }


}
