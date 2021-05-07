package modal;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;


public class ModalTest extends BaseTestNew {
    @Test
    public void testModal() {
        EntryAdPage entryadpage = homepage.clickEntryAd();
        Assert.assertEquals(entryadpage.getModalText(), "THIS IS A MODAL WINDOW", "Wrong header");
        entryadpage.clickCloseButton();
    }
}
