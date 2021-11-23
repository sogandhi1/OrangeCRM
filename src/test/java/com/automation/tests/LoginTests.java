package com.automation.tests;

import com.automation.pages.LoginPage;
import com.automation.pages.WelcomePage;
import com.automationS.components.DataProviderArgs;
import com.automationS.components.DataProviderUtils;
import com.automationS.components.TestActions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests extends TestActions {

    @Test
    public void validateLoginFunctionality() throws Exception {
        LoginPage loginPage = new LoginPage(driver.get());
        WelcomePage welcomePage = loginPage.enterUsername("Admin")
                .enterPassword("admin123")
                .hitSubmit();
        String welcomeMessage = welcomePage.getWelcomeMessage();
        System.out.println(welcomeMessage);
        Thread.sleep(3000);
    }

    @Test
    public void validateLoginFunctionality1() throws Exception {
        LoginPage loginPage = new LoginPage(driver.get());
        WelcomePage welcomePage = loginPage.enterUsername("Admin")
                .enterPassword("admin123")
                .hitSubmit();
        String welcomeMessage = welcomePage.getWelcomeMessage();
        System.out.println(welcomeMessage);
        Thread.sleep(3000);
    }

    @DataProviderArgs("validateLoginFunctionality2=username,password")
    @Test (dataProviderClass = DataProviderUtils.class, dataProvider = "jsonDataProvider")                                                          //Class of data provider Method and data provider Method
    public void validateLoginFunctionality2(String username, String password) throws Exception {
        LoginPage loginPage = new LoginPage(driver.get());
        WelcomePage welcomePage = loginPage.enterUsername(username)
                .enterPassword(password)
                .hitSubmit();
        String welcomeMessage = welcomePage.getWelcomeMessage();
        System.out.println(welcomeMessage);
        Thread.sleep(3000);
    }
}
