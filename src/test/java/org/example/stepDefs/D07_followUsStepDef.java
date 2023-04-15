package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("user opens facebook link")
    public void userOpensFacebookLink(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homePage.facebookIconUrlLoc().click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String url) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homePage.twitterIconUrlLoc().click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homePage.rssIconUrlLoc().click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homePage.youtubeIconUrlLoc().click();
    }
}
