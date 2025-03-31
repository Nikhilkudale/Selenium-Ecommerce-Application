package com.testing.EcommerceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
    	slowType(driver.findElement(By.id("user-name")), username); // Corrected call to slowType
        slowType(driver.findElement(By.id("password")), password); // Added slowType for password
        driver.findElement(By.id("login-button")).click();
    }



private void slowType(WebElement element, String text) {
    for (char c : text.toCharArray()) {
        element.sendKeys(String.valueOf(c));
        try {
            Thread.sleep(200); // 200 milliseconds delay between each keystroke
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}