package Hooks;

import Utility.Util;
import browserActions.BrowserActions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class hook  {




	@BeforeStep
	public void beforeStep() {
		BrowserActions.getDriver();
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		// To take screenshot after each step
		scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
	}

	@Before
	public static void validateGoogleSite(){
		if(! BrowserActions.validateLinkIsWorking("https://www.google.com/")) {
			throw new RuntimeException("The Website isn't responding \n Please fix it and run tests again");
		}
	}

	@After
	public void afterScenario(Scenario scenario) {
		// To take screenshot after the last step
//		scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
	}
	@After("@Last")
	public static void teardown(){
		BrowserActions.getDriver().quit();
	}
}
