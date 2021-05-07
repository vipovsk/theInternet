package horizontalslider;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTestNew {

    @Test
            public void testSlider() {
        HorizontalSliderPage horizontalSliderPage = homepage.clickHorizontalPage();
        for(int i=0; i<8;i++) {
            horizontalSliderPage.setGreaterValue();
        }
        Assert.assertEquals(horizontalSliderPage.checkResult(), "4", "The result is wrong!");
    }

}
