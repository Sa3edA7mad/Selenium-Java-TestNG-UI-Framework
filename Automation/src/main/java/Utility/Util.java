package Utility;

import browserActions.BrowserActions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Util {


	public static byte[] takeScreenShot() {
		return ((TakesScreenshot) BrowserActions.getDriver()).getScreenshotAs(OutputType.BYTES);
	}

}
