package googlePages;

import browserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InvalidSearchPage {
    public InvalidSearchPage(){

    }
    private static WebElement noMatchText =
            BrowserActions.getDriver().findElement(By.xpath("//*[@id=\"topstuff\"]/div/div/p[1]/text()[2]"));

    public static Boolean noMatchTextIsShown (){
        return (noMatchText.getText()).contains("did not match");
    }

}
