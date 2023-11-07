package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PlaylistsPage extends Helper {

    WebElement YOUR_PLAYLISTS_LABEL = driver.findElement(By.xpath("//h2[text()='Your Playlists']"));

    public void verifyYourPlaylistLabel(){
        String yourPlaylistsLabel = "Your Playlists";
        ValidateEquals(YOUR_PLAYLISTS_LABEL.getText(),yourPlaylistsLabel,"Verified 'Your Playlists' label");
    }
}
