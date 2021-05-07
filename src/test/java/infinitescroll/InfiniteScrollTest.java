package infinitescroll;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InfiiteScrollPage;

public class InfiniteScrollTest extends BaseTestNew {
    @Test
    public void testScroll() {
        InfiiteScrollPage infinScPage = homepage.clickInfiniteScroll();
        infinScPage.scrolldown(5);
        Assert.assertEquals(infinScPage.getParCount(), 5, "Wrong number of paragraphs");
    }
}
