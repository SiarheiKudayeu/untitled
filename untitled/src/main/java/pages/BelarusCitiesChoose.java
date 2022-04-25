package pages;

import org.openqa.selenium.By;

public class BelarusCitiesChoose {
    private final By buttonMinsk = By.xpath("//android.widget.TextView[@text = 'Minsk']");
    private final By buttonGomel = By.xpath("//android.widget.TextView[@text = 'Gomel']");
    private final By backButton = By.id("arrow_back_location_fragment");

    public By getBackButton() {
        return backButton;
    }

    public By getButtonGomel() {
        return buttonGomel;
    }

    public By getButtonMinsk() {
        return buttonMinsk;
    }
}
