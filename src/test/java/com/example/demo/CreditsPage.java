package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CreditsPage extends Helper{

    WebElement CREDITS = driver.findElement(By.xpath("//h1[text()='Credits']"));

    public void verifyCreditsPage(){
        Assert.assertEquals(CREDITS.isDisplayed(),true,"Verified 'Credits' label");
    }
}
