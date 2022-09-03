package webDriverSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSingleton {
    private static WebDriver driver;
    private static WebDriverSingleton webDriverSingleton = null;
    private static String driverType = "webdriver.chrome.driver";
    private static String chromeDriverPath = "./drivers/chromedriver.exe";

    private WebDriverSingleton(){
        setDriverCapabilities();
    }

    public static WebDriverSingleton getDriverSingleton(){
       if (webDriverSingleton == null)
           webDriverSingleton = new WebDriverSingleton();

       return webDriverSingleton;
    }

    private void setDriverCapabilities(){
        System.setProperty(driverType,chromeDriverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("ignore-certificate-errors");
        driver =new ChromeDriver(options);
    }

        public static WebDriver getDriver() {
            getDriverSingleton();
            return driver;
        }
    }

