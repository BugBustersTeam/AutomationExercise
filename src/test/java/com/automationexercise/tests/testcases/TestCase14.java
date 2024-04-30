package com.automationexercise.tests.testcases;

import com.automationexercise.pages.CartPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsPage;
import com.automationexercise.tests.TestBase;
import com.automationexercise.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class TestCase14 extends TestBase {

    //Test Case 14: Place Order: Register while Checkout


    @Test
    public void test14() throws InterruptedException {
        /*1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        //4. Add products to cart
        //5. Click 'Cart' button
        //6. Verify that cart page is displayed
        //7. Click Proceed To Checkout
        //8. Click 'Register / Login' button
        //9. Fill all details in Signup and create account
        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        //11. Verify ' Logged in as username' at top
        //12.Click 'Cart' button
        //13. Click 'Proceed To Checkout' button
        //14. Verify Address Details and Review Your Order
        //15. Enter description in comment text area and click 'Place Order'
        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //17. Click 'Pay and Confirm Order' button
        //18. Verify success message 'Your order has been placed successfully!'
        //19. Click 'Delete Account' button
        //20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
     */
        HomePage homePage=new HomePage();
        ProductsPage productsPage=new ProductsPage();
        CartPage cartPage=new CartPage();

        extentLogger=report.createTest("Test Case 14: Place Order: Register while Checkout");
        extentLogger.info("Step 1: Navigate to url 'http://automationexercise.com'");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Step 2: Verify that home page is visible successfully");
        homePage.verifyHomePageTitle();
        extentLogger.info("Step 3: Add products to cart");
        homePage.navigateToMenu("Products");
        productsPage.selectProductRandomly();
        productsPage.selectProductByIndex(5);
        Thread.sleep(2000);
        extentLogger.info("Step 4: Click 'Cart' button");
        productsPage.navigateToMenu("Cart");
        extentLogger.info("Step 5: Verify that cart page is displayed");
        cartPage.verifyCartPageTitle();
        extentLogger.info("Step 6: Click Proceed To Checkout");
    }
}
