package chapter6Exercise;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTests {
    @Test
    public void testHorizontalSlider() {
        var HorizontalSliderPage = homePage.clickHorizontalSlider();
        HorizontalSliderPage.setSliderValue("4");
        assertEquals(HorizontalSliderPage.getSliderValue(),"4","Slider value is not correct");
    }
}
