package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


@Getter
@AllArgsConstructor
@Setter
public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;
}
