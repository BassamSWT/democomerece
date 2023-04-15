package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("^user enter search \"(.*)\"$")
    public void userEnterSearch(String search){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.searchTextFieldLoc()));
        homePage.searchTextFieldLoc().sendKeys(search);
    }

    @Then("user enter search button")
    public void userEnterSearchButton() throws InterruptedException {
        Thread.sleep(3000);
        homePage.searchButtonLoc().click();
    }

    @And("user clicks on product")
    public void userClicksOnProduct() {
        homePage.productListLoc().get(0).click();
    }

    @Then("user check sku of product {string}")
    public void userCheckSkuOfProduct(String sku) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.skuTextLoc().getText().contains(sku));
    }

    @Then("user check products title contains {string}")
    public void userCheckProductsTitleContains(String title) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains(title));
        for (int i = 0; i < homePage.productListLoc().size(); i++) {
            //WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
            //wait.until(ExpectedConditions.elementToBeClickable(homePage.titleTextLoc().get(i)));
            softAssert.assertTrue(homePage.titleTextLoc().get(i).getText().toLowerCase().contains(title));
        }
        softAssert.assertAll();
    }
}
