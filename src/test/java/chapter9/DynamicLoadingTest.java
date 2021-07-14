package chapter9;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTest extends BaseTests {
    @Test
    public void testDynamicLoading() {
        var DynamicLoadingPage = homePage.clickDynamicLoading();
        var DynamicLoading2Page = DynamicLoadingPage.clickDynamicLoading2();
        DynamicLoading2Page.clickStartButton();
        assertEquals(DynamicLoading2Page.getLoadedTxt(),"Hello World!", "Text not found");
    }
}
