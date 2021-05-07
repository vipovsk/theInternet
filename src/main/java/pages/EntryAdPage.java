package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    private By modalText = By.cssSelector("div.modal-title h3");
    private By closeLink = By.cssSelector("div.modal-footer p");
    private WebDriver driver;
    private By modalWindow = By.id("modal");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCloseButton(){
        driver.findElement(closeLink).click();
    }
    public String getModalText(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalWindow)));
        return driver.findElement(modalText).getText();
    }
}
