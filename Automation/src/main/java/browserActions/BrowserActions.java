package browserActions;

import webDriverSingleton.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.NoSuchElementException;

public class BrowserActions {

    public static WebDriver getDriver() {
        return WebDriverSingleton.getDriver();
    }

    public static void navigateTo(String siteURL) throws IOException {
        getDriver().navigate().to(siteURL);
    }

    public static void clearTextField(WebElement textField) {
        textField.clear();
    }

    public static void enterText(String identifierType, String identifierValue, String Value) {
        WebElement elementIdentifier = elementCreator(identifierType, identifierValue);
        elementIdentifier.clear();
        elementIdentifier.sendKeys(Value);
    }

    public static Boolean validateLinkIsWorking(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(2000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println("\n"+url + " Link status is : " + httpURLConnection.getResponseMessage()+"\n \n ");
                return true;
            }
            else if (httpURLConnection.getResponseCode() == 404) {
                System.out.println(url + " is: " + httpURLConnection.getResponseMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static WebElement elementCreator(String identifierType, String identifierValue) {
        WebElement identifier = null;
        try {
            if (identifierType.equalsIgnoreCase("Id")) {
                identifier = getDriver().findElement(By.id(identifierValue));
            } else if (identifierType.equalsIgnoreCase("css")) {
                identifier = getDriver().findElement(By.cssSelector(identifierValue));
            } else if (identifierType.equalsIgnoreCase("xPath")) {
                identifier = getDriver().findElement(By.xpath(identifierValue));
            } else if (identifierType.equalsIgnoreCase("className")) {
                identifier = getDriver().findElement(By.className(identifierValue));
            } else if (identifierType.equalsIgnoreCase("linkText")) {
                identifier = getDriver().findElement(By.linkText(identifierValue));
            } else if (identifierType.equalsIgnoreCase("Name")) {
                identifier = getDriver().findElement(By.name(identifierValue));
            } else if (identifierType.equalsIgnoreCase("partialLinkText")) {
                identifier = getDriver().findElement(By.partialLinkText(identifierValue));
            } else if (identifierType.equalsIgnoreCase("tagName")) {
                identifier = getDriver().findElement(By.tagName(identifierValue));
            }
        } catch (NoSuchElementException e) {
			System.out.println( "No Such Element Found !! \n"+ e);
        }
        return identifier;
    }

    public static void closeBrowser() {
        getDriver().quit();
    }


}
