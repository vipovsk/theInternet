package baseTest;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTestNew {
    private EventFiringWebDriver driver;
   // private static WebDriver driver;
    private String link ="http://the-internet.herokuapp.com/";
    protected HomePage homepage;

@BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        // driver= new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание
        goHome();
        setCookie();
        homepage = new HomePage(driver);
        driver.get(link);
        // System.out.print("Page title is "+driver.getTitle());

    }
   /* public static void main(String[] args){
        BaseTestNew test = new BaseTestNew();
        test.setUp();
        test.tearDown();
    }*/

@AfterClass
    public void tearDown(){
        driver.quit();
    }

    @BeforeMethod
    public void goHome(){
        driver.get(link);
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    //@AfterMethod
    public void takeScreenshot(ITestResult result) throws IOException {
        TakesScreenshot camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        Files.move(screenshot, new File("src/test/resouces/screenshots/screenshot_" + result.getName()+ ".png"));

        // System.out.println(screenshot.getAbsolutePath());
    }

    @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE){
            takeScreenshot(result);
        }
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions chromeOpt = new ChromeOptions();
        chromeOpt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // w/o infobar
        //chromeOpt.setHeadless(true);  // w/o browser setup
        return chromeOpt;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("vipovsk", "1234")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);

      // driver.manage().deleteCookieNamed("optimizelyBuckets");
    }
}
