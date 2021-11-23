package com.automation.pages;

import com.automationS.components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage extends BaseActions {

    WebDriver driver;

    public WelcomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getWelcomeMessage() {
        return getTextFromElement("HomePage.lbl_WelcomeMsg");
    }
}
