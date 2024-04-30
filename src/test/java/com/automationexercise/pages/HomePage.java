package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.*;

import static org.testng.AssertJUnit.assertEquals;

public class HomePage extends BasePage{

    @FindBy(css = ".title")
    public WebElement homePageTitle;

    public void verifyHomePageTitle(){
        String expectedTitle="Automation Exercise";
        assertEquals(Driver.get().getTitle(),expectedTitle);
    }
}
