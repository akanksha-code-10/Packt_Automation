package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OwnedPage extends Helper{

    WebElement OWNED_CONTENT = driver.findElement(By.xpath("//h2[contains(text(),'owned')]"));

    public void verifyNoOwnedContent(){
        Assert.assertEquals(OWNED_CONTENT.isDisplayed(),true,"Verified 'No owned content' label");
    }
}
