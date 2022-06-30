package tests;

import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTestsPage {

    @BeforeMethod
    public void setUp() {
        getNavigationMenuPage().driverGoToLogin();

    }

    @Test(priority = 2)
    public void loginTest() {
        getLoginPage().login(getEmail(), getPassword());
        Assert.assertTrue(getNavigationMenuPage().isLogoutPresent());
        getNavigationMenuPage().clickLogoutOptions();

    }

    @Test(priority = 4)
    public void loginWithIncorrectEmail() {
        getLoginPage().login(getInvalidEmail(), getPassword());
        Assert.assertTrue(getLoginPage().isBadCredentialsMessagePresent());
        getLoginPage().clearBars();

    }

    @Test(priority = 6)
    public void loginWithInvalidPassword() {
        getLoginPage().login(getEmail(), getInvalidPassword());
        Assert.assertTrue(getLoginPage().isBadCredentialsMessagePresent());
        getLoginPage().clearBars();


    }
}
