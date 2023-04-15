package org.example.pages;

import org.example.stepDefs.D05_hoverCategoriesStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement currencyDropdownLoc(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> priceTextLoc(){
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    public WebElement searchTextFieldLoc(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButtonLoc(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public List<WebElement> productListLoc(){
        return Hooks.driver.findElements(By.className("product-item"));
    }
    public List<WebElement> titleTextLoc(){
        return Hooks.driver.findElements(By.className("product-title"));
    }
    public WebElement skuTextLoc(){
        return Hooks.driver.findElement(By.className("overview"));
    }
    public List<WebElement> categoriesListLoc(){
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }

    public List<WebElement> subCategoriesListLoc(int selectedCategories){
        return Hooks.driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)["+(selectedCategories+1)+"]/li"));
    }
    public WebElement subCategoriesTitleLoc(){
        return Hooks.driver.findElement(By.className("page-title"));
    }
    public WebElement nokiaSliderLoc(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
    }
    public WebElement iphoneSliderLoc(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
    }
    public WebElement facebookIconUrlLoc(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\""));
    }
    public WebElement twitterIconUrlLoc(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement rssIconUrlLoc(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\""));
    }
    public WebElement youtubeIconUrlLoc(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
    public WebElement wishlistProductIconButtonLoc(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }
    public WebElement wishlistLabelLoc(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public WebElement qtyTextFieldLoc(){
        return Hooks.driver.findElement(By.className("qty-input"));
    }
    public WebElement successMessageTextLoc(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement closeButtonLoc(){
        return Hooks.driver.findElement(By.className("close"));
    }

}
