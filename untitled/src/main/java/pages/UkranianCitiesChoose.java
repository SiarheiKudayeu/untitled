package pages;

import org.openqa.selenium.By;

public class UkranianCitiesChoose {
    private final By buttonKiev = By.xpath("//android.widget.TextView[@text = 'Kiev']");
    private final By backButton = By.id("arrow_back_location_fragment");

    public By getBackButton() {
        return backButton;
    }

    public By getButtonKiev() {
        return buttonKiev;
    }
}
