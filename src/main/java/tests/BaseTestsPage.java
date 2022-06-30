package tests;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import pages.AllGalleriesPage;
import pages.LoginPage;
import pages.NavigationMenuPage;
import pages.RegistrationPage;

import java.time.Duration;

@Getter
public abstract class BaseTestsPage {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private NavigationMenuPage navigationMenuPage;
    private AllGalleriesPage allGalleriesPage;
    private RegistrationPage registrationPage;
    private LoginPage loginPage;

    private final String firstName = "Niko";
    private final String firstNameVariation = "Nikos";
    private final String lastName = "Nikovic";
    private final String lastNameVariation = "Nikosić";
    private final String email = "milastests@gmail.com";
    private final String invalidEmail = "x@x.com";
    private final String password = "ASDFasdf123";
    private final String invalidPassword = "ASDFasdf1235";
    private final String confirmPassword = "ASDFasdf123";

    private final String galleryTitle = "Mila's test gallery";
    private final String galleryTitleEdited = "Mila's test gallery edited";

    private final String galleryDescription = "Light pollution is a real problem.";
    private final String image1 = "https://upload.wikimedia.org/wikipedia/commons/6/62/Starsinthesky.jpg";
    private final String image2 = "https://upload.wikimedia.org/wikipedia/commons/3/38/Stars_in_the_black_light.jpg";

    private final String commentOnGallery = "(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧";


    private final String allGalleriesURL = "https://gallery-app.vivifyideas.com/";
    private final String registrationURL = "https://gallery-app.vivifyideas.com/register";
    private final String loginURL = "https://gallery-app.vivifyideas.com/login";



    @BeforeClass
    public void beforeClass() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mila-\\Desktop\\EXE file\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(120));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        navigationMenuPage = new NavigationMenuPage(driver, driverWait);
        allGalleriesPage = new AllGalleriesPage(driver, driverWait);
        registrationPage = new RegistrationPage(driver, driverWait);
        loginPage = new LoginPage(driver, driverWait);

        driver.manage().window().maximize();
        driver.navigate().to("https://gallery-app.vivifyideas.com/");
    }


}
