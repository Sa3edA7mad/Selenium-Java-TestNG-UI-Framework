package googlePages;

import browserActions.BrowserActions;
import org.openqa.selenium.By;

public class ImageSearchPage {
    private static By googleImagesText = By.xpath("/html/body/div[1]/div[2]/div/span");

    public static Boolean isImageSearchPageOpened() {
        if (BrowserActions.getDriver().findElement(googleImagesText).getText().equalsIgnoreCase("صور") ||
                BrowserActions.getDriver().findElement(googleImagesText).getText().equalsIgnoreCase("images")) {
            return true;
        }
        return false;
    }
}
