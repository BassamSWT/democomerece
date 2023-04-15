package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("user clicks on nokia home slider")
    public void userClicksOnNokiaHomeSlider(){
        homePage.nokiaSliderLoc().click();
    }

    @Then("user check the link of slider {string}")
    public void userCheckTheLinkOfSlider(String url) {
        Assert.assertNotEquals(Hooks.driver.getCurrentUrl(),url);
    }

    @When("user clicks on iphone home slider")
    public void userClicksOnIphoneHomeSlider() {
        homePage.iphoneSliderLoc().click();
    }
}
