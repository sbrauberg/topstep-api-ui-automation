package com.topstep.pages;

import com.topstep.utils.RandomUIUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static com.topstep.utils.ConfigurationReader.getProperty;
import static com.topstep.utils.Driver.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPage extends RandomUIUtils {

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }


    @FindBy(css = "input[placeholder='Username/Email']")
    public WebElement usernameInput;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement passwordInput;

    @FindBy(css = ".tst-checkbox__checkmark.checkmark--topstep")
    public WebElement staySignedInCheckbox;

    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;

    @FindBy(css = "div[what='general error']")
    public WebElement invalidLoginOrPasswordErrorMessage;

    @FindBy(css = "dsh-validated-input[what='email input'] span[what='error message']")
    public WebElement missingUsernameErrorMessage;

    @FindBy(css = "dsh-validated-input[what='password input'] span[what='error message']")
    public WebElement missingPasswordErrorMessage;


    public void login(String username, String password) {
        waitForClickabilityAndClick(usernameInput, Duration.ofSeconds(10));
        usernameInput.sendKeys(getProperty(username));
        waitForClickabilityAndClick(passwordInput, Duration.ofSeconds(10));
        passwordInput.sendKeys(getProperty(password));
        staySignedInCheckbox.click();
        submitButton.click();
    }

    public void errorMessageValidation(String expectedErrorMessage) {
        WebElement errorMessageElement;
        switch (expectedErrorMessage) {
            case "Email/Username cannot be blank.":
                errorMessageElement = missingUsernameErrorMessage;
                break;
            case "Password cannot be blank.":
                errorMessageElement = missingPasswordErrorMessage;
                break;
            default:
                errorMessageElement = invalidLoginOrPasswordErrorMessage;
                break;
        }
        assertTrue(errorMessageElement.isDisplayed());
        assertEquals(expectedErrorMessage, errorMessageElement.getText());
    }
}
