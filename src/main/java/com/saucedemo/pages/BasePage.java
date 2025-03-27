package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class BasePage {
    //In the BasePage, I put in elements and methods that will be used commonly among other pages (findElements, sendKeys, click...)

    public static WebDriver driver;
    //Declares a static WebDriver instance that can be shared across all page objects
    // It is static to prevent creating multiple driver instances across pages and ensures all pages use the same browser session

    public void setDriver(WebDriver driver){
        //void type = nothing is returned
        BasePage.driver = driver;
    }

    protected WebElement find(By locator){
        // WebElement type = a WebElement is returned
        return driver.findElement(locator);
    }

    protected void set(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator){
        find(locator).click();
    }
}
