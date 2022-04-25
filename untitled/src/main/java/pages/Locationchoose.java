package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locationchoose {
    private final By logoImg = By.xpath("//android.widget.ImageView");
    private final By selectLoc = By.xpath("//android.widget.TextView[@text = 'Select your location']");
    private final By selectButton = By.xpath("//android.widget.ImageButton");
    private final By cityName = By.xpath("//android.widget.TextView[@text = 'Gomel']");
    private final By nextButton = By.xpath("//android.widget.TextView[@text = 'NEXT']");


    public By getLogoImg() {
        return logoImg;
    }

    public By getSelectLoc() {
        return selectLoc;
    }

    public By getSelectButton() {
        return selectButton;
    }

    public By getCityName() {
        return cityName;
    }

    public By getNextButton() {
        return nextButton;
    }
}
