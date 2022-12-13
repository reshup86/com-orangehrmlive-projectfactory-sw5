package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//form/h6 [text()= 'Reset Password']")
    WebElement errorMessage;

    public ForgotPasswordPage() {
        PageFactory.initElements(driver, this);
    }
    public String getErrorMessage() {
        Reporter.log("Error Message Displayed");
        return getTextFromElement(errorMessage);
    }
}
