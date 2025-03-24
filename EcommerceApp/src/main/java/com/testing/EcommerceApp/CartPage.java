package com.testing.EcommerceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }
    public void filldetails(String FName,String Lname,String Postal)
    {
    	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(FName);
    	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(Lname);
    	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(Postal);
    	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }
}