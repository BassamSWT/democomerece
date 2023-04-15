package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.time.Duration;

public class D08_WishlistStepDef {
    SoftAssert softAssert = new SoftAssert();
    P03_homePage homePage = new P03_homePage();
    @When("user clicks on wishlist button")
    public void userClicksOnWishlistButton(){
        homePage.wishlistProductIconButtonLoc().click();
    }

    @Then("user check that success message appeared")
    public void userCheckThatSuccessMessageAppeared() {
        softAssert.assertTrue(homePage.successMessageTextLoc().getText().equals("The product has been added to your wishlist"));
        String actualColor = homePage.successMessageTextLoc().getCssValue("background-color");
        String actualColorHex =  Color.fromString(actualColor).asHex();
        softAssert.assertTrue(actualColorHex.equals("#4bb07a"));
        homePage.closeButtonLoc().click();
    }

    @And("user clicks on wishlist label")
    public void userClicksOnWishlistLabel() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        homePage.wishlistLabelLoc().click();
    }

    @Then("user check the quantity")
    public void userCheckTheQuantity() {
        int quantity = Integer.parseInt(homePage.qtyTextFieldLoc().getAttribute("value"));
        softAssert.assertTrue(quantity>0);
        softAssert.assertAll();
    }
}
