package tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class NavigationMenuTests extends BaseTestsPage {

    @Test(priority = 0)
    public void clickLogin() {
        getNavigationMenuPage().clickLoginOptions();

        Assert.assertEquals(getNavigationMenuPage().getURL(), getLoginURL());
    }

    @Test(dependsOnMethods = {"clickLogin"})
    public void clickGalleryLogo() {

        getNavigationMenuPage().clickGalleryApp();

        Assert.assertTrue(getAllGalleriesPage().getHeaderText().contains("GALLERIES"));
    }

    @Test(priority = 4)
    public void clickRegister() {
        getNavigationMenuPage().clickRegisterOptions();

        Assert.assertEquals(getNavigationMenuPage().getURL(), getRegistrationURL());
    }

    @Test(dependsOnMethods = {"clickRegister"})
    public void clickAllGalleries() {
        getNavigationMenuPage().clickAllGalleries();

        Assert.assertTrue(getAllGalleriesPage().getHeaderText().contains("GALLERIES"));
    }

}
