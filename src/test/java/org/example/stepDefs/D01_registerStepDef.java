package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new  P01_register();

    @Given("user go to register page")
    public void userGoToRegisterPage(){
        register.registerPageButtonLoc().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.genderMaleRadioButtonLoc().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstName, String lastName) {
        register.firstNameTextFieldLoc().sendKeys(firstName);
        register.lastNameTextFieldLoc().sendKeys(lastName);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select dateOfBirthDay = new Select(register.DateOfBirthDaySelectLoc());
        Select dateOfBirthMonth = new Select(register.DateOfBirthMonthSelectLoc());
        Select dateOfBirthYear = new Select(register.DateOfBirthYearSelectLoc());
        dateOfBirthDay.selectByIndex(27);
        dateOfBirthMonth.selectByIndex(11);
        dateOfBirthYear.selectByValue("1998");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
        register.emailTextFieldLoc().sendKeys(email);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String password, String confirmPassword) {
        register.passwordTextFieldLoc().sendKeys(password);
        register.confirmPasswordTextFieldLoc().sendKeys(confirmPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.registerButtonLoc().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        String actualColor = register.successMessageLoc().getCssValue("color");
        String actualColorHex = Color.fromString(actualColor).asHex();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(register.successMessageLoc().equals("Your registration completed"));
        softAssert.assertTrue(actualColorHex.equals("#4cb17c"));
    }
}
