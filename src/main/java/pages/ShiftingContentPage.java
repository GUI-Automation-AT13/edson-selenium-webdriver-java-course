package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By menuElementPage = By.linkText("Example 1: Menu Element");

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }

    public MenuElementPage clickMenuElement(){
        driver.findElement((menuElementPage)).click();
        return new MenuElementPage(driver);
    }
}
