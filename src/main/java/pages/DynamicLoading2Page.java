package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoading2Page {
    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By loadedTxt = By.id("finish");

    public DynamicLoading2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton() {
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedTxt));
    }

    public String getLoadedTxt() {
        return driver.findElement(loadedTxt).getText();
    }

    public boolean isStartButtonDisplayed() {
        return driver.findElement(startBtn).isDisplayed();
    }
}
