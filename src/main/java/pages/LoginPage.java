package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public class LoginPage extends BasePage {

    private By emailBar = By.id("email");
    private By passwordBar = By.id("password");
    private By submitBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/form/button");
    private By badCredentialsMessage = By.xpath("//*[@id=\"app\"]/div[2]/div/form/p");

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getBadCredentialsMessage() {
        return getDriver().findElement(badCredentialsMessage);
    }

    public WebElement getEmailBar() {
        return getDriver().findElement(emailBar);
    }

    public WebElement getPasswordBar() {
        return getDriver().findElement(passwordBar);
    }

    public WebElement getSubmitBtn() {
        return getDriver().findElement(submitBtn);
    }

    public void clickSubmitBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getSubmitBtn()));
        getSubmitBtn().click();
    }

    public void login(String email, String password) {
        getEmailBar().sendKeys(email);
        getPasswordBar().sendKeys(password);
        clickSubmitBtn();

    }

    public boolean isBadCredentialsMessagePresent() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(badCredentialsMessage));
        return getBadCredentialsMessage().isDisplayed();
    }

    public void clearBars() {
        getEmailBar().clear();
        getPasswordBar().clear();
    }
}
