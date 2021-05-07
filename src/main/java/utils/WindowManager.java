package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForvard(){
        navigate.forward();
    }

    public void refresh(){
        navigate.refresh();
    }

    public void goToURL(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());
        System.out.println("Names of tabs: ");
        windows.forEach(System.out::println);

        for(String window: windows){

            System.out.println("Switching to tab" + window);
            driver.switchTo().window(window);

            System.out.println("Tab title is " + driver.getTitle());
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchToNewlyOpenedTab(){
        Set<String> windows = driver.getWindowHandles();
        List<String> windowStrings = new ArrayList<>(windows);
        String newWindow = windowStrings.get(windowStrings.size()-1);
        driver.switchTo().window(newWindow);
        }
}
