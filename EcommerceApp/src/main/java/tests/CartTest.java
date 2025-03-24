package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testing.EcommerceApp.CartPage;
import com.testing.EcommerceApp.HomePage;
import com.testing.EcommerceApp.LoginPage;
import com.testing.EcommerceApp.ProductPage;

import utils.WebDriverSetup;

public class CartTest {
    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.saucedemo.com");
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        loginPage = new LoginPage(driver); // Initialize loginPage here
    }

    @Test
    public void testCheckout() {
        loginPage.login("standard_user", "secret_sauce");
        String productName = productPage.getProductTitle();
        productPage.addToCart(productName);
        cartPage.proceedToCheckout();
        cartPage.filldetails("Nikhil","Kudale","580023");
      
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}