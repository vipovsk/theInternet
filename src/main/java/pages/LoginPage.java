package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebDriver driver;
    private static By Usernamefield = By.id("username");
    private static By Passwordfield = By.id("password");
    private static By LoginButton = By.cssSelector("button.radius");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void setUsername(String username){
        driver.findElement(Usernamefield).sendKeys(username);
    }
    static public void setPassword(String password){
        driver.findElement(Passwordfield).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver);
    }
}
