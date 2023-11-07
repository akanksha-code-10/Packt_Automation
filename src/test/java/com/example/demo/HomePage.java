package com.example.demo;
//import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class HomePage extends Helper {

    WebElement PACKTLOGO = driver.findElement(By.xpath("//img[@class='logo']"));
    WebElement BROWSE_LIBRARY = driver.findElement(By.xpath("//a[@data-rb-event-key='https://subscription.packtpub.com/search']/ancestor::div[@class='d-none d-lg-inline navbar-nav']"));
    WebElement ADVANCED_SEARCH = driver.findElement(By.xpath("//button[@class='button--more-info btn btn-primary advanced-search-button']/ancestor::div[@class='buttons  mt-0']"));
    WebElement SEARCH_TEXTBOX = driver.findElement(By.xpath("//input[@name='query']"));
    WebElement SEARCH_SUBMIT = driver.findElement(By.xpath("//button[@type='submit']"));
    WebElement MY_LIBRARY_DROP_DOWN = driver.findElement(By.id("library-dropdown"));
    WebElement RECENT = driver.findElement(By.id("recent-dropdown"));
    WebElement MY_ACCOUNT_BUTTON = driver.findElement(By.xpath("//a[@class='user-account nav-link']"));
    WebElement MY_CART_BUTTON = driver.findElement(By.id("cart-btn__BV_toggle_"));
    WebElement SIGN_OUT_BUTTON = driver.findElement(By.xpath("//a[@class='style-1 d-none d-lg-inline nav-link']"));
    WebElement ADVANCED_YOUR_KNOWLEDGE_TEXT = driver.findElement(By.xpath("//div[@class='col-md-6 mx-auto']/h2[text()='Advance your knowledge in tech']"));
    WebElement PACKT_MESSAGE = driver.findElement(By.xpath("//h4[contains(text(),'Get all the quality content')]"));
    WebElement YOUR_SUGGESTIONS_TITLE = driver.findElement(By.xpath("//div[@class='d-flex justify-content-center']/h2[@class='suggested_title']"));
    WebElement FIND_CONTENT_TEXT = driver.findElement(By.xpath("//h5[contains(text(),'Find content')]"));
    WebElement EDIT_YOUR_REFERENCES_LINK = driver.findElement(By.xpath("//a[text()='edit your preferences here']"));
    WebElement READ_NOW_BUTTON = driver.findElement(By.xpath("//a[@class='readNowButton btn-lg btn-block']"));
    WebElement ADD_TO_PLAYLIST_BUTTON = driver.findElement(By.xpath("//button[text()='Add to Playlist']"));
    WebElement START_FREE_TRIAL_BUTTON = driver.findElement(By.xpath("//a[text()='Start FREE trial']"));

    public void verifyStartFreeTrialButton(){
        Assert.assertEquals(START_FREE_TRIAL_BUTTON.isDisplayed(),true,"Verified 'Start FREE Trial' Button");
    }
    public void verifyBrowseLibraryButton(){
        String browseLibrary = "Browse Library";
        ValidateEquals(BROWSE_LIBRARY.getText(),browseLibrary,"Verified 'Browse Library' Button");
    }

    public void verifyAdvancedSearchButton(){
        String advancedSearch = "Advanced Search";
        ValidateEquals(ADVANCED_SEARCH.getText(),advancedSearch,"Verified Adcanced Search Button");
    }

    public void verifySearch(){
        Assert.assertEquals(SEARCH_TEXTBOX.isDisplayed(),true,"Verified Search Textbox");
        Assert.assertEquals(SEARCH_SUBMIT.isDisplayed(),true,"Verified Search Submit Button is displayed");
    }

    public void verifyMyLibrary(){
        String myLibrary = "My Library";
        ValidateEquals(MY_LIBRARY_DROP_DOWN.getText(),myLibrary,"Verified 'My Library' dropdown");
    }

    public void verifyRecent(){
        String recent = "Recent";
        ValidateEquals(RECENT.getText(),recent,"Verified 'Recent' dropdown");
    }

    public void verifyMyAccount(){
        Assert.assertEquals(MY_ACCOUNT_BUTTON.isDisplayed(),true,"Verified 'My Account' button is present");
    }

    public void verifyMyCart(){
        Assert.assertEquals(MY_CART_BUTTON.isDisplayed(),true,"Verified 'My Cart' button is present");
    }

    public void verifySignOutButton(){
        String signOut = "Sign Out";
        Assert.assertEquals(SIGN_OUT_BUTTON.getText(),signOut,"Verified 'Sign out' button");
    }

    public void verifyAdvancedYourKnowledgeTextIsPresent(){
        Assert.assertEquals(ADVANCED_YOUR_KNOWLEDGE_TEXT.isDisplayed(),true,"Verified 'Advanced Your Knowledge in tech' text is present");
    }

    public String verifyPacktMessage(){
        return PACKT_MESSAGE.getText();
    }

    public void verifyYourSuggestedTitle(){
        Assert.assertEquals(YOUR_SUGGESTIONS_TITLE.isDisplayed(),true,"Verified your suggestions title");
    }

    public String verifyFindContentText(){
        return FIND_CONTENT_TEXT.getText();
    }

    public void verifyEditYourReferencesLink(){
        Assert.assertEquals(EDIT_YOUR_REFERENCES_LINK.isDisplayed(),true,"Verified 'Edit Your References' Link");
    }

    public void verifyReadNowButton(){
        Assert.assertEquals(READ_NOW_BUTTON.isDisplayed(),true,"Verified 'Read Now' Button");
    }

    public void clickBrowseLibrary(){
        BROWSE_LIBRARY.click();
    }

    public void searchElement(String element){
        SEARCH_TEXTBOX.clear();
        SEARCH_TEXTBOX.click();
        SEARCH_TEXTBOX.sendKeys(element);
        SEARCH_SUBMIT.click();
        BrowseLibraryPage browseLibraryPage = new BrowseLibraryPage();
        browseLibraryPage.verifyResult(element);
    }

    public void clickMyLibrary(){
        MY_LIBRARY_DROP_DOWN.click();
    }

    public void clickRecent(){
        RECENT.click();
    }

    public void clickMyAccount(){
        MY_ACCOUNT_BUTTON.click();
    }

    public void clickAdvancedSearch(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ADVANCED_SEARCH.click();
    }

    public void clickEditPreferencesLink(){
        EDIT_YOUR_REFERENCES_LINK.click();
    }
}

