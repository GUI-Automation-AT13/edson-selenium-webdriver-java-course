package chapter7Exercise;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {
    @Test
    public void testClickRightInBox() {
        var ContextMenuPage = homePage.clickContextMenu();
        ContextMenuPage.clickRightInBox();
        String message = ContextMenuPage.getPopUpText();
        ContextMenuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "The message is not correct");
    }
}
