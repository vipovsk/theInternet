package navigation;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class NavigationTest extends BaseTestNew {
    @Test
    public void testNavigation(){
        DynamicLoadingPage dynlpage = homepage.clickDynamicLoading();
        DynamicLoadingPage.Example1Page ex1page = dynlpage.clickExample1();

        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForvard();
        getWindowManager().goToURL("https://tut.by");
    }

    @Test
    public void testMultipleWindows(){
        homepage.clickMultiplePages().clickHere();
        getWindowManager().switchToTab("New Window");

    }

    @Test
    public void testSwitchBetweenWindows(){  //W7
        DynamicLoadingPage dynlpage2 = homepage.clickDynamicLoading();
        DynamicLoadingPage.Example2Page ex2page = dynlpage2.openExample2InNewTab();
        getWindowManager().switchToNewlyOpenedTab();
        Assert.assertEquals(ex2page.checkStartButton(), true, "Start button is not displayed");
    }
}
