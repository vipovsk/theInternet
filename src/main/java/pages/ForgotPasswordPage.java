package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
        private WebDriver driver;
        private By email = By.id("email");
        private By button = By.className("icon-signin");
        private By result = By.tagName("h1");

        public ForgotPasswordPage(WebDriver driver){
            this.driver=driver;
        }

        public void fillEmailField(String validemail){
            driver.findElement(email).sendKeys(validemail);
        }

        public void clickRetrievePassword(){
            driver.findElement(button).click();
        }

        public String ckeclInternalError(){
            return driver.findElement(result).getText();
        }
}
