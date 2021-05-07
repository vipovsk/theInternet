package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By middleFrame = By.xpath(".//frame [@name=\"frame-middle\"]");
    private String topFrameName = "frame-top";
    private int middleFrameIndex = 1;
    private String bottomFrameName = "frame-bottom";
    private By bottomFrame = By.xpath(".//frame [@name=\"frame-bottom\"]");
    private By middleFrameText = By.id("content");
    private By buttomFrameText = By.tagName("body");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToMiddleFrame(){
        driver.switchTo().frame(topFrameName);
        driver.switchTo().frame(middleFrameIndex);
    }

    public void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrameName);
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public String getMiddleText(){
        switchToMiddleFrame();
        String middleText = driver.findElement(middleFrameText).getText();
        switchToMainArea();
        return middleText;
    }

    public String getBottomText(){
        switchToBottomFrame();
        String bottomText = driver.findElement(buttomFrameText).getText();
        switchToMainArea();
        return bottomText;
    }
}
