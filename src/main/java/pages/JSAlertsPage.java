package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()=\"Click for JS Alert\"]");
    private By result = By.id("result");
    private By triggerConfirmButton = By.xpath(".//button[text()=\"Click for JS Confirm\"]");
    private By triggerPromptButton = By.xpath(".//button[text()=\"Click for JS Prompt\"]");

    public JSAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void acceptPopup(){
        driver.switchTo().alert().accept();
    }
    public void dismissPopup(){
        driver.switchTo().alert().dismiss();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public String getConfirmText(){
        return driver.switchTo().alert().getText();
    }

    public void setPromptText(String promptText){
        driver.switchTo().alert().sendKeys(promptText);
    }

}
