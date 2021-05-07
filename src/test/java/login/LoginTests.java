package login;

import baseTest.BaseTest;
import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTestNew {

@Test
    public void testSuccessfulLogin() {
        LoginPage loginpage = HomePage.clickFormAuthentication();
        LoginPage.setUsername("tomsmith");
        LoginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage sap = loginpage.clickLoginButton();
        Assert.assertEquals(sap.getMsg(), "You logged into a secure area!\n" +
                "×", "Massage is wrong");
    }
}
