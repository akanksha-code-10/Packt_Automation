package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BrowseLibraryPage extends Helper {

    WebElement FILTER_RESULT_LABEL = driver.findElement(By.xpath("//div[@class='filter-results']"));
    WebElement RESET_ALL_BUTTON = driver.findElement(By.xpath("//button[@class='reset-button']"));
    WebElement BROWSE_LIBRARY_SEARCH_BAR = driver.findElement(By.xpath("//div[@class='search-input-wrapper mr-2']/div[@class='search-input ']"));


    public void verifyFilterResult(){
        Assert.assertEquals(FILTER_RESULT_LABEL.isDisplayed(),true,"Verified 'Filter Results' label");
    }

    public void verifyResetAllButton(){
        Assert.assertEquals(RESET_ALL_BUTTON.isDisplayed(),true,"Verified 'Reset All' Button");
    }

    public void verifyBrowseLibrarySearchBar(){
        Assert.assertEquals(BROWSE_LIBRARY_SEARCH_BAR.isDisplayed(),true,"Verified search bar");
    }

    public void verifyResult(String element){
        String searchNotFoundMessage = "We didn't find any results for the search";
        WebElement SEARCH_ELEMENT = driver.findElement(By.xpath("//div[contains(text(),'"+element+"')]"));
        WebElement DIDNT_FIND_TEXT = driver.findElement(By.xpath("//div[@class='products-wrapper']/div"));
        if(SEARCH_ELEMENT.isDisplayed()){
            Assert.assertEquals(SEARCH_ELEMENT.isDisplayed(),true,"Verified Search Element is present");
        }
        else {
            ValidateEquals(DIDNT_FIND_TEXT.getText(),searchNotFoundMessage,"Verified message");
        }
    }
}
