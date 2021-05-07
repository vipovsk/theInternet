package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
        private WebDriver driver;
        private By field = By.id("target");
        private By checker = By.id("result");

        public KeyPressesPage(WebDriver driver){
            this.driver=driver;
        }

        public void typeKeys(String text){
            driver.findElement(field).sendKeys(text);
        }

        public String checkResult(){
            return driver.findElement(checker).getText();
        }

        public String checkField(){
            return driver.findElement(field).getAttribute("value");
        }
}
