package com.automation.pages;

import com.automationS.components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseActions {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public LoginPage enterUsername(String username) throws Exception {
        typeInTo("LoginPage.tbx_Username", username);
        return this;
    }
    public LoginPage enterPassword(String password) throws Exception{
        typeInTo("LoginPage.tbx_Password", password);
        return this;
    }
    public WelcomePage hitSubmit() throws Exception{
        clickIt("LoginPage.btn_Submit");
        return new WelcomePage(driver);
    }
}
