package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();
    @Given("user select currency type")
    public void userSelectCurrencyType(){
        Select currencyDropdown = new Select(homePage.currencyDropdownLoc());
        currencyDropdown.selectByVisibleText("Euro");
    }

    @Then("user check the currency of all products")
    public void userCheckTheCurrencyOfAllProducts() {
        for (int i = 1; i < homePage.priceTextLoc().size(); i++) {
            String productsPrice = homePage.priceTextLoc().get(i).getText();
            Assert.assertTrue(productsPrice.contains("€"));
        }
    }
}
