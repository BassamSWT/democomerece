package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginPageButtonLoc(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement emailTextFieldLoc(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordTextFieldLoc(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButtonLoc(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement myAccountLinkTextLoc(){
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement errorMessageTextLoc(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
