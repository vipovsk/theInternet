package pages;   //frames

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String frameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increseIndentButton = By.cssSelector("[title='Increase indent']");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToTextArea(){
        driver.switchTo().frame(frameId);
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clearTextArea(){
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void typeTexttoTextArea(String str){
        switchToTextArea();
        driver.findElement(textArea).sendKeys(str);
        switchToMainArea();
    }

    public void increaseIndent(){
        driver.findElement(increseIndentButton).click();
    }

    public String getTextAreaContent(){
        switchToTextArea();
        String str = driver.findElement(textArea).getText();
        switchToMainArea();
        return str;
    }

}
