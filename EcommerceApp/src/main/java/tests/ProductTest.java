package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testing.EcommerceApp.HomePage;
import com.testing.EcommerceApp.LoginPage;
import com.testing.EcommerceApp.ProductPage;

import utils.WebDriverSetup;

public class ProductTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    ProductPage productPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.saucedemo.com");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
    }

    @Test
    public void testAddToCart() {
        loginPage.login("standard_user", "secret_sauce");
        String productName = productPage.getProductTitle();
        productPage.addToCart(productName);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}