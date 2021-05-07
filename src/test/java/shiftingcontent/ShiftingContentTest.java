package shiftingcontent;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShiftingContentPage;

public class ShiftingContentTest extends BaseTestNew {
    @Test

    public void testMenusCount(){
        ShiftingContentPage shiftingContentPage = homepage.clickShiftingContent();
        ShiftingContentPage.ShiftingMenuPage shiftMenuPage = shiftingContentPage.clickExample1();
        Assert.assertEquals(shiftMenuPage.countMenus(), 5, "Wrong number of menus");
    }

}
