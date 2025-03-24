package com.testing.EcommerceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver; // Corrected constructor
    }

    public void addToCart(String productName) {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    public String getProductTitle() {
        return driver.findElement(By.className("inventory_item_name")).getText();
    }
}