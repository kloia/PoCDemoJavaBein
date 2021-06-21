package com.poc.pages;

import com.poc.utils.Driver;
import com.poc.utils.GeneralUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PlayerPage {

    public PlayerPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id = "bmpui-id-66")
    public WebElement channelButton;

    @FindBy(css = "ul#bmpui-id-36>li")
    public List<WebElement> channelList;

    @FindBy(id = "bmpui-id-56")
    public WebElement playButton;

    public void isChannelInTheList(String channelName){
        channelButton.click();
        List<String> textsOfWebElements = GeneralUtils.getTextsOfWebElements(channelList);

        Assert.assertTrue(textsOfWebElements.contains(channelName));


    }


    public void clickPlayButton(){
        playButton.click();
    }
}
