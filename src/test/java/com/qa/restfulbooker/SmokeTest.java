package com.qa.restfulbooker;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {
    @Test
    public void openBrowser() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationintesting.online");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
