package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    private static WebElement clickLink(String linkText){
        return driver.findElement(By.linkText(linkText));
    }

    public static LoginPage clickFormAuthentication(){
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }

    public static DropDownPage clickDropdown(){
        clickLink("Dropdown").click();
        return new DropDownPage(driver);
    }

    public static HoversPage clickHovers(){
        clickLink("Hovers").click();
        return new HoversPage(driver);
    }

    public static KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses").click();
        return new KeyPressesPage(driver);
    }

    public static ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password").click();
        return new ForgotPasswordPage(driver);
    }

    public static HorizontalSliderPage clickHorizontalPage(){
        clickLink("Horizontal Slider").click();
        return new HorizontalSliderPage(driver);
    }

    public static ShiftingContentPage clickShiftingContent(){
        clickLink("Shifting Content").click();
        return new ShiftingContentPage(driver);
    }

    public static JSAlertsPage clickJSAlerts(){
        clickLink("JavaScript Alerts").click();
        return new JSAlertsPage(driver);
    }

    public static FileUploadPage clickFileUpload(){
        clickLink("File Upload").click();
        return new FileUploadPage(driver);
    }

    public static EntryAdPage clickEntryAd(){
        clickLink("Entry Ad").click();
        return new EntryAdPage(driver);
    }

    public static WYSIWYGEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor").click();
        return new WYSIWYGEditorPage(driver);
    }

    public static DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading").click();
        return new DynamicLoadingPage(driver);
    }

    public static LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM").click();
        return new LargeAndDeepDomPage(driver);
    }

    public static InfiiteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll").click();
        return new InfiiteScrollPage(driver);
    }

    public static NestedFramesPage clickNestedFrames(){
        clickLink("Nested Frames").click();
        return new NestedFramesPage(driver);
    }

    public static MultipleWindowsPage clickMultiplePages(){
        clickLink("Multiple Windows").click();
        return new MultipleWindowsPage(driver);
    }
}
