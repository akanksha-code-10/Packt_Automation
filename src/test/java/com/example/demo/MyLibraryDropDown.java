package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyLibraryDropDown extends Helper {

    WebElement HOME = driver.findElement(By.xpath("//span[text()='Home']"));
    WebElement PLAYLISTS = driver.findElement(By.xpath("//span[text()='Playlists']"));
    WebElement BOOKMARKS = driver.findElement(By.xpath("//span[text()='Bookmarks']"));
    WebElement NOTES = driver.findElement(By.xpath("//span[text()='Notes']"));
    WebElement OWNED = driver.findElement(By.xpath("//span[text()='Owned']"));
    WebElement CREDITS = driver.findElement(By.xpath("//span[text()='Credits']"));

    public void verifyHomeOption(){
        Assert.assertEquals(HOME.isDisplayed(),true,"Verified 'Home' option");
    }

    public void verifyPlaylistOption(){
        Assert.assertEquals(PLAYLISTS.isDisplayed(),true,"Verified 'Playlists' option");
    }

    public void verifyBookmarksOption(){
        Assert.assertEquals(BOOKMARKS.isDisplayed(),true,"Verified 'Bookmarks' option");
    }

    public void verifyNotesOption(){
        Assert.assertEquals(NOTES.isDisplayed(),true,"Verified 'Notes' option");
    }

    public void verifyOwnedOption(){
        Assert.assertEquals(OWNED.isDisplayed(),true,"Verified 'Owned' option");
    }

    public void verifyCreditsOption(){
        Assert.assertEquals(CREDITS.isDisplayed(),true,"Verified 'Credits' option");
    }

    public void clickHome(){
        HOME.click();
    }

    public void clickPlaylists(){
        PLAYLISTS.click();
    }

    public void clickBookmarks(){
        BOOKMARKS.click();
    }

    public void clickNotes(){
        NOTES.click();
    }

    public void clickOwned(){
        OWNED.click();
    }

    public void clickCredits(){
        CREDITS.click();
    }
}
