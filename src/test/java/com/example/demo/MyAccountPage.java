package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyAccountPage extends Helper{

    WebElement MY_ACCOUNT_LABEL = driver.findElement(By.xpath("//span[text()='My Account']"));

    public void verifyMyAccountLabel(){
        Assert.assertEquals(MY_ACCOUNT_LABEL.isDisplayed(),true,"Verified 'My Account' label");
    }
}
