package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage extends BasePage {

    private By firstNameBar = By.id("first-name");
    private By lastNameBar = By.id("last-name");
    private By emailBar = By.id("email");
    private By passwordBar = By.id("password");
    private By confirmPasswordBar = By.id("password-confirmation");
    private By checkBoxTermsAndConditions = By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[6]/input");
    private By submitBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/form/button");

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

    public void clickLastNameBar() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getLastNameBar()));
        getLastNameBar().click();
    }

    public WebElement getEmailBar() {
        return getDriver().findElement(emailBar);

    }

    public void clickEmailBar() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getEmailBar()));
        getEmailBar().click();
    }

    public WebElement getPasswordBar() {
        return getDriver().findElement(passwordBar);

    }

    public void clickPasswordBar() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getPasswordBar()));
        getPasswordBar().click();
    }

    public WebElement getConfirmPasswordBar() {
        return getDriver().findElement(confirmPasswordBar);

    }

    public void clickConfirmPasswordBar() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getConfirmPasswordBar()));
        getConfirmPasswordBar().click();
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
