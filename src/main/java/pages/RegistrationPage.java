package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public class RegistrationPage extends BasePage {

    private By firstNameBar = By.id("first-name");
    private By lastNameBar = By.id("last-name");
    private By emailBar = By.id("email");
    private By passwordBar = By.id("password");
    private By confirmPasswordBar = By.id("password-confirmation");
    private By checkBoxTermsAndConditions = By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[6]/input");
    private By submitBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/form/button");
    private By emailNotificationMessage = By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[3]/p");

    public RegistrationPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getFirstNameBar() {
        return getDriver().findElement(firstNameBar);

    }

    public WebElement getSubmitBtn() {
        return getDriver().findElement(submitBtn);

    }

    public void clickSubmitBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getSubmitBtn()));
        getSubmitBtn().click();
    }

    public WebElement getLastNameBar() {
        return getDriver().findElement(lastNameBar);

    }

    public WebElement getEmailNotificationMessage() {
        return getDriver().findElement(emailNotificationMessage);
    }

    public String getEmailNotificationText() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(emailNotificationMessage));
        return getEmailNotificationMessage().getText();
    }

    public WebElement getEmailBar() {
        return getDriver().findElement(emailBar);

    }


    public WebElement getPasswordBar() {
        return getDriver().findElement(passwordBar);

    }

    public WebElement getConfirmPasswordBar() {
        return getDriver().findElement(confirmPasswordBar);

    }

    public WebElement getCheckBar() {
        return getDriver().findElement(checkBoxTermsAndConditions);

    }

    public void clickCheckBar() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getCheckBar()));
        getCheckBar().click();
    }

    public void fillOutRegistrationForm
            (String firstName,
             String lastName,
             String email,
             String password,
             String confirmPassword) {
        getFirstNameBar().sendKeys(firstName);
        getLastNameBar().sendKeys(lastName);
        getEmailBar().sendKeys(email);
        getPasswordBar().sendKeys(password);
        getConfirmPasswordBar().sendKeys(confirmPassword);
        clickCheckBar();
        clickSubmitBtn();

    }

}
