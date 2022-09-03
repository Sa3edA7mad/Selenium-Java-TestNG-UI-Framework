package googlePages;

import browserActions.BrowserActions;
import org.openqa.selenium.By;

public class ResultsPage {
    private static By searchResultsList = By.xpath("//input[@class=\'LC20lb MBeuO DKV0Md\']");
    private static By firstSearchResult = By.className("yuRUbf");

    public static String resultPageText (String searchTerm, Integer index){
       return BrowserActions.getDriver().findElements(searchResultsList).get(index).getText();
    }
    public static void clickOnResult ( Integer index){
        BrowserActions.getDriver().findElement(firstSearchResult).click();
    }
}
