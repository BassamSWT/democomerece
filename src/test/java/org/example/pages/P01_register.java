package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerPageButtonLoc(){
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement genderMaleRadioButtonLoc(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement firstNameTextFieldLoc(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastNameTextFieldLoc(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement DateOfBirthDaySelectLoc(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement DateOfBirthMonthSelectLoc(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement DateOfBirthYearSelectLoc(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement emailTextFieldLoc(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordTextFieldLoc(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPasswordTextFieldLoc(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButtonLoc(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement successMessageLoc(){
        return Hooks.driver.findElement(By.className("result"));
    }
}
