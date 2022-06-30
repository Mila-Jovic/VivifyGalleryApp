package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public class AllGalleriesPage extends BasePage {
    private By header = By.xpath("//*[@id=\"app\"]/div[2]/div/h1");
    private By filterBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/button");
    private By myGalleryOption = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a");
    private By createGallery = By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[3]/a");
    private By galleryTitleBar = By.id("title");
    private By galleryDescriptionsBar = By.id("description");
    private By galleryImageBar = By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div/div/input");
    private By secondGalleryImageBar = By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div[2]/div/input");
    private By addImageBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/button");
    private By submitBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/button[1]");
    private By firstGallery = By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div[1]/h2/a");
    private By editGalleryBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/a");
    private By deleteGalleryBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/button");
    private By editedGalleyNotification = By.xpath("//*[@id=\"app\"]/div[2]/div/h1");
    private By noGalleryFoundNotification = By.linkText("My Galleries");
    private By commentBar = By.xpath("//*[@id=\"app\"]/div[2]/div/div[4]/form/div/textarea");
    private By commentTitle = By.xpath("//*[@id=\"app\"]/div[2]/div/div[3]/ul/li/p[1]");
    private By deleteCommentBtn = By.xpath("//*[@id=\"app\"]/div[2]/div/div[3]/ul/li/div/button");


    public AllGalleriesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getEditGalleryBtn() {
        return getDriver().findElement(editGalleryBtn);
    }

    public WebElement getCommentBar() {
        return getDriver().findElement(commentBar);
    }

    public void addComment(String comment) {
        getCommentBar().sendKeys(comment);
        clickSubmitBtn();
    }

    public WebElement getCommentTitle() {
        return getDriver().findElement(commentTitle);
    }

    public boolean isCommentPresent() {
        return getCommentTitle().isDisplayed();

    }


    public String getCommentTitleText() {
        return getCommentTitle().getText();

    }

    public WebElement getDeleteCommentBtn() {
        return getDriver().findElement(deleteCommentBtn);
    }

    public void clickDeleteCommentBtn() {
        getDeleteCommentBtn().click();

    }

    public WebElement getNoGalleyFound() {
        return getDriver().findElement(noGalleryFoundNotification);
    }

    public boolean isNoGalleryFoundNotificationPresent() {
        return getNoGalleyFound().isDisplayed();

    }

    public WebElement getEditGalleryNotification() {
        return getDriver().findElement(editedGalleyNotification);
    }

    public String editedGalleryNotificationText() {
        return getEditGalleryNotification().getText();

    }

    public void clickEditGalleryBtn() {
        getEditGalleryBtn().click();
    }

    public WebElement getDeleteGalleryBtn() {
        return getDriver().findElement(deleteGalleryBtn);
    }

    public void clickDeleteGalleryBtn() {
        getDeleteGalleryBtn().click();
    }

    public WebElement getFirstGallery() {
        return getDriver().findElement(firstGallery);
    }

    public String firstGalleryTitle() {
        return getFirstGallery().getText();
    }

    public void clickFirstGallery() {
        getFirstGallery().click();
    }

    public WebElement getGalleryTitleBar() {
        return getDriver().findElement(galleryTitleBar);
    }

    public void editGalleryTitle(String edit) {
        getGalleryTitleBar().clear();
        getGalleryTitleBar().sendKeys(edit);

    }

    public WebElement getGalleryDescriptionsBar() {
        return getDriver().findElement(galleryDescriptionsBar);
    }

    public WebElement getGalleryImageBar() {
        return getDriver().findElement(galleryImageBar);
    }

    public WebElement getSecondGalleryImageBar() {
        return getDriver().findElement(secondGalleryImageBar);
    }

    public WebElement getAddImageBtn() {
        return getDriver().findElement(addImageBtn);
    }

    public void clickAddImageBtn() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(addImageBtn));
        getAddImageBtn().click();
    }

    public WebElement getSubmitBtn() {
        return getDriver().findElement(submitBtn);
    }

    public void clickSubmitBtn() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(submitBtn));
        getSubmitBtn().click();
    }


    public WebElement getMyGallery() {
        return getDriver().findElement(myGalleryOption);
    }


    public void clickMyGalleryOptions() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getMyGallery()));
        getMyGallery().click();

    }

    public WebElement getCreateGallery() {
        return getDriver().findElement(createGallery);
    }

    public void clickCreateGallery() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(createGallery));
        getCreateGallery().click();

    }

    public WebElement getHeader() {
        return getDriver().findElement(header);
    }

    public String getHeaderText() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(header));
        return getHeader().getText();

    }

    public void makeAGallery(String title, String descriptions, String image1, String image2) {
        getGalleryTitleBar().sendKeys(title);
        getGalleryDescriptionsBar().sendKeys(descriptions);
        getGalleryImageBar().sendKeys(image1);
        clickAddImageBtn();
        getSecondGalleryImageBar().sendKeys(image2);
        clickSubmitBtn();

    }

    public void closeAlert() {
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
    }


}
