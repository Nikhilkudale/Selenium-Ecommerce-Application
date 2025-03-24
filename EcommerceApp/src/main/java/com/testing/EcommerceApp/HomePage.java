package com.testing.EcommerceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.get("https://www.saucedemo.com");
    }

    public void searchProduct(String productName) {
        driver.findElement(By.id("search-input")).sendKeys(productName);
        driver.findElement(By.id("search-button")).click();
    }
}