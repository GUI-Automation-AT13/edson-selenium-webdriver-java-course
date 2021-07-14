package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String LeftFrameText() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String textFrame = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return textFrame;
    }

    public String BottomFrameText() {
        driver.switchTo().frame(bottomFrame);
        String textFrame = getFrameText();
        driver.switchTo().parentFrame();
        return textFrame;
    }

    private String getFrameText() {
        return driver.findElement(body).getText();
    }
}
