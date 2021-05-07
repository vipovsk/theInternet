package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector("[type=\"range\"]");
    private By result = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }

    public void setGreaterValue(){
        driver.findElement(slider).sendKeys(Keys.RIGHT);
    }

    public String checkResult(){
        return driver.findElement(result).getText();
    }
}
