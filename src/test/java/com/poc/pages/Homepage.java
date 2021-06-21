package com.poc.pages;

import com.poc.utils.Driver;
import com.poc.utils.GeneralUtils;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.get(), this);
    }




    public void clickLoginButton(){
        GeneralUtils.clickWithLinkText("Giriş Yap");
    }


    public void navigateModule(String subMenu, String title){
        GeneralUtils.hoverOverText(title);
        GeneralUtils.clickWithLinkText(subMenu);
    }




}
