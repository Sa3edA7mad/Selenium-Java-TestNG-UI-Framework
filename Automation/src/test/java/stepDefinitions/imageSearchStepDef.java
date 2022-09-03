package stepDefinitions;

import browserActions.BrowserActions;
import googlePages.GoogleHomePage;
import googlePages.ImageSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class imageSearchStepDef {
    @When("Clicking on image search button")
    public void clickingOnImageSearchButton() {
        GoogleHomePage.clickOnImagesButton();
    }

    @Then("User moved to image search page.")
    public void userMovedToImageSearchPage() {
        Assert.assertTrue(ImageSearchPage.isImageSearchPageOpened(), "Images page didn't open.");
    }
}
