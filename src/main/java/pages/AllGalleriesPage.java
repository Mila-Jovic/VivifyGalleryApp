package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllGalleriesPage extends BasePage {
    private By header = By.xpath("//*[@id=\"app\"]/div[2]/div/h1");
    private By filterBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/button");
    private By myGalleryOption = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a");
    private By createGallery = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[3]/a");




    public AllGalleriesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getHeader (){
        return getDriver().findElement(header);
    }
    public String  getHeaderText (){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(header));
        return getHeader().getText();
    }
    public WebElement getMyGallery (){
        return getDriver().findElement(myGalleryOption);
    }
    public void clickMyGalleryOptions (){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(myGalleryOption));
        getMyGallery().click();
    }
    public WebElement getCreateGallery (){
        return getDriver().findElement(createGallery);
    }
    public void clickCreateGallery (){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(createGallery));
        getCreateGallery().click();
    }
    public boolean isMyGalleryPresent (){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(myGalleryOption));
       return getMyGallery().isDisplayed();
    }

}
