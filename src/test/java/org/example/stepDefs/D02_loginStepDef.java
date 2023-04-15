package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    @Given("^user go to login page$")
    public void userGoToLoginPage(){
        login.loginPageButtonLoc().click();
    }
    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public void userLoginWithAnd(String email, String password) {
        login.emailTextFieldLoc().sendKeys(email);
        login.passwordTextFieldLoc().sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButtonLoc().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        if (Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/")) {
            softAssert.assertTrue(login.myAccountLinkTextLoc().isDisplayed());
        }else {
            softAssert.assertTrue(login.errorMessageTextLoc().getText().contains("Login was unsuccessful."));
            String actualColor = login.errorMessageTextLoc().getCssValue("color");
            String actualColorHex = Color.fromString(actualColor).asHex();
            softAssert.assertTrue(actualColorHex.equals("#e4434b"));
        }
        softAssert.assertAll();
    }
}
