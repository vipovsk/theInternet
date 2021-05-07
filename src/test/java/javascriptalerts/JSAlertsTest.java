package javascriptalerts;

import baseTest.BaseTestNew;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

public class JSAlertsTest extends BaseTestNew {
    @Test
    public void testAlert(){
        JSAlertsPage jsAlertsPage = homepage.clickJSAlerts();
        jsAlertsPage.triggerAlert();
        jsAlertsPage.acceptPopup();
        Assert.assertEquals(jsAlertsPage.getResult(), "You successfully clicked an alert", "Alert was not accepted");
    }

    @Test
    public  void testConfirmText(){
        JSAlertsPage jsAlertsPage = homepage.clickJSAlerts();
        jsAlertsPage.triggerConfirm();
        Assert.assertEquals(jsAlertsPage.getConfirmText(), "I am a JS Confirm", "Wrong Confirm text");
        jsAlertsPage.dismissPopup();
    }

    @Test
    public  void testConfirmOk(){
        JSAlertsPage jsAlertsPage = homepage.clickJSAlerts();
        jsAlertsPage.triggerConfirm();
        jsAlertsPage.acceptPopup();
        Assert.assertEquals(jsAlertsPage.getResult(), "You clicked: Ok", "Popup was not accepted");
    }

    @Test
    public  void testConfirmCancel(){
        JSAlertsPage jsAlertsPage = homepage.clickJSAlerts();
        jsAlertsPage.triggerConfirm();
        jsAlertsPage.dismissPopup();
        Assert.assertEquals(jsAlertsPage.getResult(), "You clicked: Cancel", "Popup was not cancelled");
    }

    @Test
    public  void testPromptSetText(){
        JSAlertsPage jsAlertsPage = homepage.clickJSAlerts();
        jsAlertsPage.triggerPrompt();
        jsAlertsPage.setPromptText("ulala");
        jsAlertsPage.acceptPopup();
        Assert.assertEquals(jsAlertsPage.getResult(), "You entered: ulala", "Wrong text on prompt");
    }

    @Test
    public  void testPromptAcceptNull(){
        JSAlertsPage jsAlertsPage = homepage.clickJSAlerts();
        jsAlertsPage.triggerPrompt();
        jsAlertsPage.acceptPopup();
        Assert.assertEquals(jsAlertsPage.getResult(), "You entered:", "Wrong result text when the input is empty");
    }

    @Test
    public  void testPromptCancelNull(){
        JSAlertsPage jsAlertsPage = homepage.clickJSAlerts();
        jsAlertsPage.triggerPrompt();
        jsAlertsPage.dismissPopup();
        Assert.assertEquals(jsAlertsPage.getResult(), "You entered: null", "Wrong result text when prompt is cancelled");
    }

    @Test
    public  void testPromptCancelWithInput(){
        JSAlertsPage jsAlertsPage = homepage.clickJSAlerts();
        jsAlertsPage.triggerPrompt();
        jsAlertsPage.setPromptText("ulala");
        jsAlertsPage.dismissPopup();
        Assert.assertEquals(jsAlertsPage.getResult(), "You entered: null", "Wrong result text when prompt is cancelled");
    }

}
