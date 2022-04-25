package tests.authorization;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static constants.Constant.ValidCredo.VALID_MAIL;
import static constants.Constant.ValidCredo.VALID_PASS;
import static pages.BasePage.capabilities;

public class AuthorizTest {

    @Test
    public void validAuth() throws Exception {
        AndroidDriver<AndroidElement> driver = capabilities();
        AuthorizationPage authorizationPage = new AuthorizationPage();
        Locationchoose locationchoose = new Locationchoose();
        driver.findElement(authorizationPage.getEmailInput()).sendKeys(VALID_MAIL);
        driver.findElement(authorizationPage.getPasswordInput()).sendKeys(VALID_PASS);
        driver.findElement(authorizationPage.getButtoLogin()).click();
        Assert.assertTrue(driver.findElement(locationchoose.getSelectLoc()).isDisplayed(), "Login is not succesed");
    }

}
