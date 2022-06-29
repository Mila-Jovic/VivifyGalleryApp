package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseTestsPage{

    @Test
    public void registerNewUser () {
        getNavigationMenuPage().clickRegisterOptions();
        getRegistrationPage().fillOutRegistrationForm
                (getFirstName(),
                        getLastName(),
                        getEmail(),
                        getPassword(),
                        getConfirmPassword());
        Assert.assertTrue(getAllGalleriesPage().isMyGalleryPresent());
    }

}


