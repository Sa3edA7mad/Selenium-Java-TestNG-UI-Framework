package stepDefinitions;

import browserActions.BrowserActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import googlePages.GoogleHomePage;


public class homepageItemsStepDef {

    @Given("{string} homepage opens")
    public void homepageOpens(String url) {
        BrowserActions.getDriver().navigate().to(url);
    }

    @Then("All main homepage elements are showing")
    public void allMainHomepageElementsAreShowing() {
        Assert.assertTrue(GoogleHomePage.isSearchFieldDisplayed(),"Search bar filed is not displayed");
        Assert.assertTrue(GoogleHomePage.isFeelingLuckyButtonDisplayed(),"Feeling lucky button is not displayed");
        Assert.assertTrue(GoogleHomePage.isSearchButtonDisplayed(),"Search button is not displayed");
    }


}
