package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Bookmarks extends Helper{

    WebElement MANAGE_YOUR_BOOKMARKS_LABEL = driver.findElement(By.xpath("//h2[contains(text(),'Manage Your Bookmarks')]"));

    public void verifyManageYourBookmarksLabel(){
        Assert.assertEquals(MANAGE_YOUR_BOOKMARKS_LABEL.isDisplayed(),true,"Verified 'Manage Your Bookmarks' label");
    }
}
