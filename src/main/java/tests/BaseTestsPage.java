package tests;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import pages.AllGalleriesPage;
import pages.NavigationMenuPage;

import java.time.Duration;

@Getter
public abstract class BaseTestsPage {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private NavigationMenuPage navigationMenuPage;
    private AllGalleriesPage allGalleriesPage;


    @BeforeClass
    public void beforeClass() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mila-\\Desktop\\EXE file\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(120));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        navigationMenuPage = new NavigationMenuPage(driver, driverWait);
        allGalleriesPage = new AllGalleriesPage(driver, driverWait);

        driver.manage().window().maximize();
        driver.navigate().to("https://gallery-app.vivifyideas.com/");
    }


}
