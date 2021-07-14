package chapter11;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavegateTabTest extends BaseTests {
    @Test
    public void testWindowTabs() {
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        var dynamicLoading2Page = dynamicLoadingPage.controlPlusRightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(dynamicLoading2Page.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
