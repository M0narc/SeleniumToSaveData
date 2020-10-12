package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;


public class LogInTest extends BaseTest {

    @Test
    public void testSuccesfulLogIn(){
        LoginPage loginpage = homePage.clickFormAuthentication();
        loginpage.setUserNameField("tomsmith");
        loginpage.setPassField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginpage.clickLogInButton();

//        assertEquals(secureAreaPage.getAlertText(),
//                "You logged into a secure area!",
//                "Alert text is incorrect");

        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area"), "Alert text is incorrect");
    }
}
