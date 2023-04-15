package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void OpenBrowser()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public static void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.quit();
    }
}