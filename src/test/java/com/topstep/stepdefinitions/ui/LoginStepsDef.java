package com.topstep.stepdefinitions.ui;

import com.topstep.pages.LandingPage;
import com.topstep.pages.LoginPage;
import com.topstep.utils.RandomUIUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import java.time.Duration;


public class LoginStepsDef extends RandomUIUtils {
    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the Topstep login page")
    public void user_is_on_the_topstep_login_page() {
        assertTitle("Topstep | Learn How to Become a Funded Futures Trader");

        if (isElementDisplayedAndEnabled(landingPage.popupWindowCloseButton)) {
            waitForClickabilityAndClick(landingPage.popupWindowCloseButton, Duration.ofSeconds(10));
            waitForClickabilityAndClick(landingPage.cookiesRejectAllButton, Duration.ofSeconds(10));
            waitForClickabilityAndClick(landingPage.saveMyPreferencesButton, Duration.ofSeconds(10));
        }
        waitForClickabilityAndClick(landingPage.loginButton, Duration.ofSeconds(10));
    }

    @Given("User logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("Page title should display {string}")
    public void page_title_should_display(String title) {
        assertTitle(title);
    }


    @Then("Error message {string} should be displayed")
    public void errorMessageShouldBeDisplayed(String expectedErrorMessage) {
        loginPage.errorMessageValidation(expectedErrorMessage);
    }
}
