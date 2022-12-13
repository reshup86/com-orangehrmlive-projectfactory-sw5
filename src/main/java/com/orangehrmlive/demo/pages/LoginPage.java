package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button [@type = 'submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//span/h6 [text()='Dashboard']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//form/div/p [text() = 'Forgot your password? ']")
    WebElement forgotPassword;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String username) {
        Reporter.log("Enter username " + username + " to username field " + usernameField.toString());
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on Login Button");
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        Reporter.log("Error Message Displayed");
        return getTextFromElement(errorMessage);
    }

    public void clickOnForgotPasswordLink() {
        Reporter.log("Click on ForgotPasswordLink");
        clickOnElement(forgotPassword);
    }

}
