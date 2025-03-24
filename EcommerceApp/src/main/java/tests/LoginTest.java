package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testing.EcommerceApp.HomePage;
import com.testing.EcommerceApp.LoginPage;

import utils.WebDriverSetup;

public class LoginTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.saucedemo.com");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}