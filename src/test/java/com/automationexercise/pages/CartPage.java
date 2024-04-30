package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;

import static org.testng.AssertJUnit.assertEquals;

public class CartPage extends BasePage{

    public void verifyCartPageTitle(){
        String expectedTitle="Automation Exercise - Checkout";
        assertEquals(Driver.get().getTitle(),expectedTitle);
    }
}
