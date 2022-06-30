package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllGalleriesPage extends BasePage {
    private By header = By.xpath("//*[@id=\"app\"]/div[2]/div/h1");
    private By filterBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/button");



    public AllGalleriesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getHeader() {
        return getDriver().findElement(header);
    }

    public String getHeaderText() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(header));
        return getHeader().getText();
    }


}
