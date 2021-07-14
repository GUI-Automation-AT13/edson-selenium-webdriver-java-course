package chapter8Exercise;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesPageTest extends BaseTests {
    @Test
    public void testFramesPage() {
        var framesPage = homePage.clickFramePage();
        var nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.LeftFrameText(), "LEFT", "Incorrect frame left");
        assertEquals(nestedFramesPage.BottomFrameText(), "BOTTOM", "Incorrect frame bottom");
    }
}
