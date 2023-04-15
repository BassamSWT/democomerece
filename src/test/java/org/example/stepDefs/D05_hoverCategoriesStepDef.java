package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {
    public String selectedSubCategoriesText;
    public int selectedCategories;
    P03_homePage homePage = new P03_homePage();
    @When("user need to hover one of the categories")
    public void userNeedToHoverOneOfTheCategories() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Thread.sleep(3000);
        Actions action = new Actions(Hooks.driver);
        int count = homePage.categoriesListLoc().size();
        int min = 0;
        int max = count-5;
        selectedCategories = (int) Math.floor(Math.random() * (max - min + 1) + min);
        action.moveToElement(homePage.categoriesListLoc().get(selectedCategories)).perform();
        //System.out.println(homePage.categoriesListLoc().get(0).getText());
    }

    @And("user need to select on of the sub categories")
    public void userNeedToSelectOnOfTheSubCategories() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        int count = homePage.subCategoriesListLoc(selectedCategories).size();
        int min = 0;
        int max = count-1;
        int selectedSubCategories = (int) Math.floor(Math.random() * (max - min + 1) + min);
        selectedSubCategoriesText = homePage.subCategoriesListLoc(selectedSubCategories).get(selectedSubCategories).getText();
        homePage.subCategoriesListLoc(selectedCategories).get(selectedSubCategories).click();
    }

    @Then("user check whether page title equal the selected sub category")
    public void userCheckWhetherPageTitleEqualTheSelectedSubCategory() {
        Assert.assertTrue(homePage.subCategoriesTitleLoc().getText().contains(selectedSubCategoriesText));
    }
}
