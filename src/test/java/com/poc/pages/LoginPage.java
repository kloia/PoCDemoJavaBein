package com.poc.pages;

import com.poc.utils.ConfReader;
import com.poc.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "bc-input-username")
    public WebElement usernameBox;

    @FindBy(id = "bc-input-password")
    public WebElement passwordBox;

    @FindBy(id = "bc-btn-login-submit")
    public WebElement loginButton;



    public void loginWithValidAccount(){
        String username = ConfReader.get("username");
        String password = ConfReader.get("password");
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);

        loginButton.click();
    }


}
