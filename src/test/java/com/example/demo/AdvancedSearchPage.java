package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AdvancedSearchPage extends Helper{

    WebElement ADVANCED_SEARCH_LABEL = driver.findElement(By.xpath("//h2[contains(text(),'Advanced Search')]"));

    public void verifyAdvancedSearch(){
        Assert.assertEquals(ADVANCED_SEARCH_LABEL.isDisplayed(),true,"Verified 'Advanced search' label");
    }
}
