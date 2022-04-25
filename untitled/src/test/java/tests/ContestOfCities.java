package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;

import static constants.Constant.ValidCredo.VALID_MAIL;
import static constants.Constant.ValidCredo.VALID_PASS;
import static pages.BasePage.capabilities;

public class ContestOfCities {
        @Test
    public void contecstOfCities() throws MalformedURLException {
        AuthorizationPage authorizationPage = new AuthorizationPage();
        BelarusCitiesChoose belarusCitiesChoose = new BelarusCitiesChoose();
        UkranianCitiesChoose ukranianCitiesChoose = new UkranianCitiesChoose();
        RussianCitiesChoose russianCitiesChoose = new RussianCitiesChoose();
        CountriesPage countriesPage = new CountriesPage();
        Locationchoose locationchoose = new Locationchoose();
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.findElement(authorizationPage.getEmailInput()).sendKeys(VALID_MAIL);
        driver.findElement(authorizationPage.getPasswordInput()).sendKeys(VALID_PASS);
        driver.findElement(authorizationPage.getButtoLogin()).click();
        Assert.assertTrue(driver.findElement(locationchoose.getSelectLoc()).isDisplayed(), "Login is not succesed");
        driver.findElement(locationchoose.getSelectButton()).click();
        driver.findElement(countriesPage.getSelectBelarus()).click();
        Assert.assertTrue(driver.findElement(belarusCitiesChoose.getButtonGomel()).isDisplayed(), "Гомеля нет в списке");
        Assert.assertTrue(driver.findElement(belarusCitiesChoose.getButtonMinsk()).isDisplayed(), "Минска нет в списке");
        driver.findElement(belarusCitiesChoose.getBackButton()).click();
        driver.findElement(countriesPage.getSelectUkraine()).click();
        Assert.assertTrue(driver.findElement(ukranianCitiesChoose.getButtonKiev()).isDisplayed(), "Киева нет в списке");
        driver.findElement(ukranianCitiesChoose.getBackButton()).click();
        driver.findElement(countriesPage.getSelectRussia()).click();
        Assert.assertTrue(driver.findElement(russianCitiesChoose.getButtonSaintP()).isDisplayed(), "Питера нет в списке");
        Assert.assertTrue(driver.findElement(russianCitiesChoose.getButtonKazan()).isDisplayed(), "Казани нет в списке");
    }
}
