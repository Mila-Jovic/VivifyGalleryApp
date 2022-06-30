package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Getter

public class NavigationMenuPage extends BasePage {
    private By galleryAppLogo = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/a");
    private By allGalleriesOption = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/a");
    private By loginOption = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[1]/a");
    private By registerOption = By.linkText("Register");
    private By myGalleryOption = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a");
    private By createGallery = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[3]/a");
    private By logoutOption = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]/a");


    public NavigationMenuPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public WebElement getMyGallery() {
        return getDriver().findElement(myGalleryOption);
    }

    public void clickMyGalleryOptions() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(myGalleryOption));
        getMyGallery().click();
    }

    public WebElement getCreateGallery() {
        return getDriver().findElement(createGallery);
    }

    public void clickCreateGallery() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(createGallery));
        getCreateGallery().click();
    }

    public boolean isLogoutPresent() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(logoutOption));
        return getLogoutOptions().isDisplayed();
    }


    public WebElement getLogoutOptions() {
        return getDriver().findElement(logoutOption);

    }

    public void clickLogoutOptions() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getLogoutOptions()));
        getLogoutOptions().click();

    }

    public WebElement getLoginOptions() {
        return getDriver().findElement(loginOption);

    }

    public void clickLoginOptions() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getLoginOptions()));
        getLoginOptions().click();

    }

    public WebElement getGalleryAppLogo() {
        return getDriver().findElement(galleryAppLogo);

    }

    public void clickGalleryApp() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getGalleryAppLogo()));
        getGalleryAppLogo().click();

    }

    public WebElement getRegisterOptions() {
        return getDriver().findElement(registerOption);

    }

    public void clickRegisterOptions() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getRegisterOptions()));
        getRegisterOptions().click();

    }

    public WebElement getAllGalleries() {
        return getDriver().findElement(allGalleriesOption);

    }

    public void clickAllGalleries() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getAllGalleries()));
        getAllGalleries().click();

    }

    public String getURL() {
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        return getDriver().getCurrentUrl();
    }

    public void driverGoToRegistration() {
        getDriver().navigate().to("https://gallery-app.vivifyideas.com/");
        clickRegisterOptions();
    }
    public void driverGoToLogin() {
        getDriver().navigate().to("https://gallery-app.vivifyideas.com/");
        clickLoginOptions();
    }
}
