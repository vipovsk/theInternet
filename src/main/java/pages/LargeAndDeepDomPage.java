package pages;

import org.openqa.selenium.*;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By tableLocator = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable(){
        WebElement table = driver.findElement(tableLocator);
        String script = "arguments[0].scrollIntoView()";  //индекс аргумента
        ((JavascriptExecutor)driver).executeScript(script, table);  //а тут можно было неск передавать или коллекцию даже
    }
}
