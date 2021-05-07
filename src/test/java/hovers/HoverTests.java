package hovers;

import baseTest.BaseTestNew;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTestNew {

    @Test
    public void hoverTests(){
        HoversPage hoverspage = homepage.clickHovers();
        HoversPage.Caption caption = hoverspage.hoverOverPic(0);
        Assert.assertTrue(caption.captionIsDisplayed());
        Assert.assertEquals(caption.checkHeaderText(), "name: user1", "Wrong header text");
        Assert.assertEquals(caption.checkLinkHref(), "http://the-internet.herokuapp.com/users/1", "Wrong link href");
        Assert.assertEquals(caption.checkLinkText(), "View profile", "Wrong link text");
    }

}
