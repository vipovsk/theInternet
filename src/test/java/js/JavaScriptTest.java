package js;

import baseTest.BaseTestNew;
import org.testng.annotations.Test;
import pages.LargeAndDeepDomPage;

public class JavaScriptTest extends BaseTestNew {
    @Test
    public void testScroll(){
        LargeAndDeepDomPage largeanddeeppage = homepage.clickLargeAndDeepDom();
        largeanddeeppage.scrollToTable();
    }

}
