package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NotesPage extends Helper{

    WebElement NOTES = driver.findElement(By.xpath("//h2[contains(text(),'notes')]"));

    public void verifyYouHaveNoNotesLabel(){
        Assert.assertEquals(NOTES.isDisplayed(),true,"Verified 'You have no notes' label");
    }
}
