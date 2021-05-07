package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By firstLink = By.linkText("Example 1: Menu Element");

    public ShiftingContentPage(WebDriver driver){
        this.driver=driver;
    }

    public ShiftingMenuPage clickExample1(){
       driver.findElement(firstLink).click();
       return new ShiftingMenuPage(driver);
    }

    public class ShiftingMenuPage{
        private WebDriver driver;
        private By menu = By.cssSelector("ul > li");

        public ShiftingMenuPage(WebDriver driver) {
            this.driver=driver;
        }

        public int countMenus(){
            return driver.findElements(menu).size();
        }

    }
}
