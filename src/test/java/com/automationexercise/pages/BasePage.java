package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.*;

public abstract class BasePage {
    public BasePage(){PageFactory.initElements(Driver.get(),this);}

    public void navigateToMenu(String menu){
        Driver.get().findElement(By.xpath("//a[contains(.,'"+menu+"')]")).click();
    }
}
