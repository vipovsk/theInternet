package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickHereText = By.linkText("Click Here");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHere() {
        driver.findElement(clickHereText).click();
    }


}
