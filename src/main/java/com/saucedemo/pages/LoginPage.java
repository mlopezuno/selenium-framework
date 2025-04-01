package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    //We extend to the super class BasePage to inherit

    //Selectors specific to LoginPage
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");

    //Methods specific to LoginPage
    public void setUsername(String username){
        set(usernameField, username);
    }

    public void setPassword(String password){
        set(passwordField, password);
    }

    public ProductsPage clickLoginButton(){
        //ProductsPage type because this is a transition method, it goes from one page to another
        click(loginButton);
        return new ProductsPage();
        //we need to return the page where this will go
    }

    public ProductsPage logIntoApplication(String username, String password){
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        //String type because it returns text
        return find(errorMessage).getText();
    }
}
