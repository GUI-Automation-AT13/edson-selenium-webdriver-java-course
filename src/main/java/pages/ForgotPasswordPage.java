package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordBtn = By.id("form_submit");
    private By internalServerErrorTxt = By.cssSelector("h1");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public ForgotPasswordPage clickRetrievePassword() {
        driver.findElement(retrievePasswordBtn).click();
        return new ForgotPasswordPage(driver);
    }

    public String getTitlePage(){
        return driver.findElement(internalServerErrorTxt).getText();
    }
}
