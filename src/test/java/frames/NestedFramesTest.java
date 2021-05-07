package frames;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NestedFramesPage;


public class NestedFramesTest extends BaseTestNew {
    @Test
    public void testMiddleFrameText() {
        NestedFramesPage nestedFramesPage = homepage.clickNestedFrames();
        Assert.assertEquals(nestedFramesPage.getMiddleText(), "MIDDLE", "Wrong text in the middle frame");
    }

    @Test
    public void testBottomText() {
        NestedFramesPage nestFramesPage = homepage.clickNestedFrames();
        Assert.assertEquals(nestFramesPage.getBottomText(), "BOTTOM", "Wrong text in the bottom frame");
    }
}
