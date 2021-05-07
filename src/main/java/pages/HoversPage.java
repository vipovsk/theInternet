package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By pic = By.className("figure");
    public By caption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public Caption hoverOverPic(int i) {
        WebElement img = driver.findElements(pic).get(i); //находим элемент из группы по индексу


        Actions action = new Actions(driver);
        action.moveToElement(img).perform(); //hover + perform


        return new Caption(img.findElement(caption));
    }

    public class Caption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        Caption(WebElement caption){
            this.caption = caption;
        }

        public boolean captionIsDisplayed(){
            return caption.isDisplayed();
        }

        public String checkHeaderText(){
            return caption.findElement(header).getText();
        }

        public String checkLinkText(){
            return caption.findElement(link).getText();
        }

        public String checkLinkHref(){
            return caption.findElement(link).getAttribute("href");
        }
    }
}
