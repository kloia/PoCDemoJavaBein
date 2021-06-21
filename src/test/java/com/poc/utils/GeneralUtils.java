package com.poc.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class GeneralUtils {


    public static void clickWithLinkText(String link){
        Driver.get().findElement(By.linkText(link)).click();
    }

    public static void hoverOverText(String text){
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(Driver.get().findElement(By.linkText(text))).perform();

    }

    public static List<String> getTextsOfWebElements(List<WebElement> listOfWebElement){
        List<String> listOfText = new ArrayList<>();
        for (WebElement webElement : listOfWebElement) {

            listOfText.add(webElement.getText());

        }

        return listOfText;
    }
}
