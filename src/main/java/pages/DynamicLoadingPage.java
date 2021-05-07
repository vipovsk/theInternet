package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1link = By.linkText("Example 1: Element on page that is hidden");
    private By example2link = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1(){
        driver.findElement(example1link).click();
        return new Example1Page(driver);
    }

    public Example2Page clickExample2(){
        driver.findElement(example2link).click();
        return new Example2Page(driver);
    }


    public Example2Page openExample2InNewTab(){
        Actions action = new Actions(driver);
        //action.sendKeys(Keys.CONTROL + clickExample2()).perform();
        action.keyDown(Keys.CONTROL).click(driver.findElement(example2link)).perform();
        return new Example2Page(driver);
    }


    public class Example1Page{
        private WebDriver driver;
        private By startButton = By.cssSelector("div #start button");
        private By loading = By.id("loading");
        private By text = By.id("finish");

        public Example1Page(WebDriver driver) {
            this.driver = driver;
        }

        public void clickStartButton(){
            driver.findElement(startButton).click();
            WebDriverWait wait = new WebDriverWait(driver, 5);  //implicit
            wait.until(ExpectedConditions.invisibilityOfElementLocated(loading));
        }

        public String getFinishText(){
            return driver.findElement(text).getText();
        }
    }


    public class Example2Page{
        private WebDriver driver;
        private By startButton = By.cssSelector("#start button");
        private By text = By.id("finish");

        public Example2Page(WebDriver driver) {
            this.driver = driver;
        }

        public void clickStartButton(){
            driver.findElement(startButton).click();
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(text));
        }

        public String getFinishText(){
            return driver.findElement(text).getText();
        }

        public boolean checkStartButton(){
            return driver.findElement(startButton).isDisplayed();
        }

    }
}
