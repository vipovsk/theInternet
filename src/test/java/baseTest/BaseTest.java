package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BaseTest {
    private static WebDriver driver;
    private String link ="http://the-internet.herokuapp.com/";


    @BeforeClass
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        driver= new ChromeDriver();

        driver.get(link);
        // driver.navigate().to(link); the same as above

        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(360, 720)); //for phone

        List<WebElement> alinks = driver.findElements(By.tagName("a"));
        System.out.println(alinks.size());
        Assert.assertEquals(alinks.size(), 46 ,"Wrong quantity of the links");

        List<WebElement> listedlinks = driver.findElements(By.cssSelector("li>a"));
        Assert.assertEquals(listedlinks.size(), 44 ,"Wrong quantity of the links");

    }
     @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public static void main(String[] args) throws IllegalStateException {
        BaseTest test = new BaseTest();
        try {
            test.setUp();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test.tearDown();
    }

}
