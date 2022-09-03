package googlePages;

import browserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
    private static By searchBar = By.name("q");
    private static By googleSearchButton =By.xpath("//div[3]/center/input[1]");
    private static By feelingLuckyButton =By.xpath("//div[3]/center/input[2]");
    private static By suggestionsList = By.className("sbct");
    private static By imagesButton = By.xpath("//*[@id=\'gb\']/div/div[1]/div/div[2]/a");
    private static By arabicVerLink = By.partialLinkText("العربية");
    private static By englishVerLink = By.partialLinkText("English");
    private static By arabicKeyboardButton = By.className("yAnw3c");


    public GoogleHomePage(){
    }

public static WebElement getSearchField(){
    return BrowserActions.getDriver().findElement(searchBar);
}
    public static void clearSearchField(){
        BrowserActions.getDriver().findElement(searchBar).clear();
    }
    public static void enterTextInSearchField(String text){
        BrowserActions.getDriver().findElement(searchBar).sendKeys(text);
    }
    public static void clickSearchButton(){
        BrowserActions.getDriver().findElement(googleSearchButton).click();
    }
    public static void clickFeelingLuckyButton(){
        BrowserActions.getDriver().findElement(feelingLuckyButton).click();
    }
    public static void getTextOfSuggestionsListItems(Integer itemIndex){
        BrowserActions.getDriver().findElements(suggestionsList).get(itemIndex).getText();
    }
    public static Boolean isSearchFieldDisplayed(){
    if (BrowserActions.getDriver().findElement(searchBar).isDisplayed()){
        return true;
    }
    else
        return false;
    }
    public static Boolean isSearchButtonDisplayed(){
        if (BrowserActions.getDriver().findElement(googleSearchButton).isDisplayed()){
            return true;
        }
        else
            return false;
    }
    public static Boolean isFeelingLuckyButtonDisplayed(){
        if (BrowserActions.getDriver().findElement(feelingLuckyButton).isDisplayed()){
            return true;
        }
        else
            return false;
    }
    public static void clickOnImagesButton (){
        BrowserActions.getDriver().findElement(imagesButton).click();
  }
}
