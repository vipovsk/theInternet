package forgotpw;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTestNew {

    @Test
    public void test500Errors() {
        ForgotPasswordPage forgotPWpage = homepage.clickForgotPassword();

        forgotPWpage.fillEmailField("irina.vipovskay@gmail.com");
        forgotPWpage.clickRetrievePassword();
        Assert.assertEquals(forgotPWpage.ckeclInternalError(), "Your e-mail's been sent!", "Oh shit! 500 Internal Error");

    }
}
