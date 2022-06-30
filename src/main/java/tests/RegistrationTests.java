package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseTestsPage {
    @BeforeMethod
    public void setUp() {
        getNavigationMenuPage().driverGoToRegistration();
    }

    @Test
    public void registerNewUser() {
        //This demo site remembers all new users we make, but only the email needs to change to register a new user

        getRegistrationPage().fillOutRegistrationForm
                (getFirstName(),
                        getLastName(),
                        getEmail(),
                        getPassword(),
                        getConfirmPassword());

        Assert.assertTrue(getAllGalleriesPage().isMyGalleryPresent());
    }

    @Test
    public void registerWithExistingEmail() {

        getRegistrationPage().fillOutRegistrationForm
                (getFirstNameVariation(),
                        getLastNameVariation(),
                        getEmail(),
                        getPassword(),
                        getConfirmPassword());

        Assert.assertTrue(getRegistrationPage().getEmailNotificationText().contains("email has already been taken"));

    }

}


