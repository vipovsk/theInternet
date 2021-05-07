package dynamicloading;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseTestNew {

    @Test
    public void testHiddenElement(){
        DynamicLoadingPage dlpage = homepage.clickDynamicLoading();
        DynamicLoadingPage.Example1Page ex1page = dlpage.clickExample1();
        ex1page.clickStartButton();
        Assert.assertEquals(ex1page.getFinishText(), "Hello World!", "Wrong Finish text");
    }

    @Test
    public void testElementRenderedAfterLoading(){
        DynamicLoadingPage dlpage = homepage.clickDynamicLoading();
        DynamicLoadingPage.Example2Page ex2page = dlpage.clickExample2();
        ex2page.clickStartButton();
        Assert.assertEquals(ex2page.getFinishText(), "Hello World!", "Wrong Finish text");
    }

}
