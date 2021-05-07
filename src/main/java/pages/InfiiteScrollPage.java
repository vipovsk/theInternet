package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InfiiteScrollPage {
    private WebDriver driver;
    private By paragraph = By.className("jscroll-added");

    public InfiiteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrolldown(int parIndex){  // 1-based index
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        while(getParCount() < parIndex){
            js.executeScript(script);
        }
    }

    public int getParCount(){
        List<WebElement> par = driver.findElements(paragraph);
        return par.size();
    }
}
