package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EditPreferencesPage extends Helper{

    WebElement PICK_YOUR_INTERESTS_LABEL = driver.findElement(By.xpath("//h6[text()='Pick Your Interests']"));

    public void verifyPickYourInterests(){
        Assert.assertEquals(PICK_YOUR_INTERESTS_LABEL.isDisplayed(),true,"Verified 'Pick Your Interests' label");
    }

}
