package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example2Link = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoading2Page clickDynamicLoading2() {
        driver.findElement(example2Link).click();
        return new DynamicLoading2Page(driver);
    }

    public DynamicLoading2Page controlPlusRightClickOnExample2Link(){
        driver.findElement(example2Link).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoading2Page(driver);
    }
}
