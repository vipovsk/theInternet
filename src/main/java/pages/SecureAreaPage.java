package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By msg = By.id("flash");

    SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String getMsg(){
        return driver.findElement(msg).getText();
    }

}
