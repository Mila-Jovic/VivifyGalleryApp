package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTestsPage {
    @BeforeClass
    public void setUp() {
        getNavigationMenuPage().driverGoToLogin();
        getLoginPage().login(getEmail(), getPassword());

    }

    @Test
    public void logoutTest() {
        getNavigationMenuPage().clickLogoutOptions();
        Assert.assertTrue(getNavigationMenuPage().isLoginPresent());
    }
}
