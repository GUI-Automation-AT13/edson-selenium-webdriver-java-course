package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElementPage {
    private WebDriver driver;
    private By menuItemsLi = By.tagName("li");


    public MenuElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> menuItems(){
        return driver.findElements(menuItemsLi);
    }
}
