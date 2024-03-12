package com.topstep.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.topstep.utils.ConfigurationReader.getProperty;
import static com.topstep.utils.Driver.getDriver;

public class LandingPage {
    public LandingPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "button[aria-label='Close']")
    public WebElement popupWindowCloseButton;

    @FindBy(css = "label[aria-label='Reject All'] span[class='hu-toggle-heading']")
    public WebElement cookiesRejectAllButton;

    @FindBy(id = "hu-cookies-save")
    public WebElement saveMyPreferencesButton;

    @FindBy(xpath = "//header[@class='main-header']//div[3]//a[1]")
    public WebElement loginButton;

    public void navigateToLandingPage() {
        getDriver().get(getProperty("topstep.url"));
    }


}
