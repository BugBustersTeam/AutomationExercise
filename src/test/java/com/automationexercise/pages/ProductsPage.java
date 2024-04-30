package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//*[@class='productinfo text-center']")
    public WebElement products;

    @FindBy(css = ".btn-success")
    public WebElement continueShoppingBtn;

    //Randomly select a product
    public void selectProductRandomly() throws InterruptedException {
        int x= (int) (Math.random()*34);
        WebElement product= Driver.get().findElement(By.xpath("(//*[@class='productinfo text-center'])["+x+"]//a[@class='btn btn-default add-to-cart']"));
        product.click();
        //Close the pop-up
        continueShoppingBtn.click();
        Thread.sleep(1000);
    }

    //Select a product by index
    public void selectProductByIndex(int index) throws InterruptedException {
        WebElement product=Driver.get().findElement(By.xpath("(//*[@class='productinfo text-center'])["+index+"]//a[@class='btn btn-default add-to-cart']"));
        product.click();
        //Close the pop-up
        continueShoppingBtn.click();
        Thread.sleep(1000);
    }

}
