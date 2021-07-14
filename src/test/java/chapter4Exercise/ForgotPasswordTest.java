package chapter4Exercise;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void testForgotPassword() {
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("tau@example.com");
        var forgotPasswordPageResponse = forgotPasswordPage.clickRetrievePassword();
        assertEquals(forgotPasswordPageResponse.getTitlePage(),"Internal Server Error", "Message not found");
    }
}
