package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");


    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickInputField(){
    driver.findElement(uploadButton).click();
    }

    public void uploadFile(String link){
        driver.findElement(inputField).sendKeys(link);
        clickInputField();
    }

    public String getUploadedFiles(){
       return driver.findElement(uploadedFiles).getText();
    }
}
