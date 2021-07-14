package chapter3Exercise;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ShiftingContentTest extends BaseTests {
    @Test
    public void NumberOfElementsMenu() {
        var ShiftingContentPage = homePage.clickShiftingContent();
        var MenuElementPage = ShiftingContentPage.clickMenuElement();
        List<WebElement> menuItems = MenuElementPage.menuItems();
        System.out.println("Number menu elements : "+menuItems.size());
        for (WebElement menu : menuItems) {
            System.out.println(menu.getText());
        }
    }
}
