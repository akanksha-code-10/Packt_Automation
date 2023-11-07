package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RecentPage extends Helper{

    WebElement NO_RESULT_FOUND_MESSAGE = driver.findElement(By.xpath("//div[text()='No Result Found']"));

    public void verifyNoResultFoundMessage(){
        Assert.assertEquals(NO_RESULT_FOUND_MESSAGE.isDisplayed(),true,"Verified 'No Result Found' message");
    }
}
