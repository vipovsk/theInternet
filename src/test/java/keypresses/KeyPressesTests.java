package keypresses;

import baseTest.BaseTestNew;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeyPressesTests extends BaseTestNew {
    @Test

    public void testkeypresses(){
        KeyPressesPage keypressespage = homepage.clickKeyPresses();

        keypressespage.typeKeys("Ulala");
        Assert.assertEquals(keypressespage.checkResult(), "You entered: A", "Wrong result!!");

    }

    @Test
    public void testbackspace(){
        KeyPressesPage keypressespage1 = homepage.clickKeyPresses();
        keypressespage1.typeKeys("Hello world" + Keys.BACK_SPACE);
        Assert.assertEquals(keypressespage1.checkResult(), "You entered: BACK_SPACE", "Wrong result");
    }

    @Test
    public void testbackchord(){
        KeyPressesPage keypressespage2 = homepage.clickKeyPresses();
        keypressespage2.typeKeys("Hello world!" + Keys.chord(Keys.CONTROL, "z"));
        Assert.assertEquals(keypressespage2.checkResult(), "You entered: Z", "Wrong result");
    }

}
