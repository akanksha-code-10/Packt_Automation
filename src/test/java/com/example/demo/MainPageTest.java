package com.example.demo;
import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.attribute;


public class MainPageTest extends Helper{

    @Test
    public void verifyHomePage(){
        String userName = "ashirsath05@gmail.com";
        String password = "Akanksha@10";
        String expectedColor = "rgba(255, 255, 255, 1)";
        String packtMessage = "Get all the quality content you’ll ever need to stay ahead with a Packt subscription – access over 7,500 online books and videos on everything in tech";
        String findContentText = "Find content based on your preferences and activity, edit your preferences here";
        String searchPython = "Python";
        String searchPaint = "Paint";
        String searchSecure = "Secure";
        String searchTableau = "Tableau";

        driver.manage().window().maximize();
        driver.get("https://www.packtpub.com/login?returnUrl=https%3A%2F%2Fsubscription.packtpub.com%2F&_gl=1%2aq8elgv%2a_gcl_au%2aODI1NDYzMjU2LjE2OTg5MTk1Mzk.%2a_ga%2aMTEyODA2NDYxMi4xNjk4OTE5NDg1%2a_ga_Q4R8G7SJDK%2aMTY5OTA4MjUzOC43LjAuMTY5OTA4MjUzOC42MC4wLjA.");
        addTestStep("Navigate to Packt Login Page");

        LoginPage loginPage = new LoginPage();
        loginPage.login(userName,password);
        addTestStep("Logged in to the application");
       //ValidateEquals(loginPage.checkColor(),expectedColor,"Verified colour of 'Start FREE trail' button");

        HomePage homePage = new HomePage();
        homePage.verifyBrowseLibraryButton();
        homePage.verifyAdvancedSearchButton();
        homePage.verifySearch();
        homePage.verifyMyLibrary();
        homePage.verifyRecent();
        homePage.verifyMyAccount();
        homePage.verifyMyCart();
        homePage.verifySignOutButton();
        homePage.verifyAdvancedYourKnowledgeTextIsPresent();
        ValidateEquals(homePage.verifyPacktMessage(),packtMessage,"Verified packt message");
        homePage.verifyYourSuggestedTitle();
        ValidateEquals(homePage.verifyFindContentText(),findContentText,"Verified text");
        homePage.verifyEditYourReferencesLink();
        homePage.verifyReadNowButton();
        addTestStep("Verified all the elements of home page");

        homePage.clickBrowseLibrary();
        addTestStep("Cliked on 'Browse Library' option");

        BrowseLibraryPage browseLibraryPage = new BrowseLibraryPage();
        browseLibraryPage.verifyFilterResult();
        browseLibraryPage.verifyResetAllButton();
        browseLibraryPage.verifyBrowseLibrarySearchBar();
        addTestStep("Verified that application is navigated to the 'Browse Library' page");

        navigateToHomePage();
        homePage.clickAdvancedSearch();
        addTestStep("Clicked on 'Advanced Search' option");

        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
        advancedSearchPage.verifyAdvancedSearch();
        addTestStep("Verified that application is navigated to 'Advanced Search' page");

        navigateToHomePage();
        homePage.searchElement(searchPython);
        navigateToHomePage();
        homePage.searchElement(searchPaint);
        navigateToHomePage();
        homePage.searchElement(searchSecure);
        navigateToHomePage();
        homePage.searchElement(searchTableau);
        addTestStep("Searched for 'Python','Paint','Secure' and 'Tableau' in search bar");

        navigateToHomePage();
        homePage.clickMyLibrary();
        addTestStep("Clicked on 'My Library' option in home page");

        MyLibraryDropDown myLibraryDropDown = new MyLibraryDropDown();
        myLibraryDropDown.verifyHomeOption();
        myLibraryDropDown.verifyPlaylistOption();
        myLibraryDropDown.verifyBookmarksOption();
        myLibraryDropDown.verifyNotesOption();
        myLibraryDropDown.verifyOwnedOption();
        myLibraryDropDown.verifyCreditsOption();
        addTestStep("Verified that all options present in 'My Library' drop down");

        myLibraryDropDown.clickHome();
        homePage.verifyStartFreeTrialButton();
        addTestStep("Clicked on 'Home' option in 'My Library' and verified application is navigated to the same page");

        homePage.clickMyLibrary();
        myLibraryDropDown.clickPlaylists();
        PlaylistsPage playlistsPage = new PlaylistsPage();
        playlistsPage.verifyYourPlaylistLabel();
        addTestStep("Clicked on 'Playlists' option in 'My Library' and verified application is navigated to the same page");

        navigateToHomePage();
        homePage.clickMyLibrary();
        myLibraryDropDown.clickBookmarks();
        Bookmarks bookmarks = new Bookmarks();
        bookmarks.verifyManageYourBookmarksLabel();
        addTestStep("Clicked on 'Bookmarks' option in 'My Library' and verified application is navigated to the same page");

        navigateToHomePage();
        homePage.clickMyLibrary();
        myLibraryDropDown.clickNotes();
        NotesPage notesPage = new NotesPage();
        notesPage.verifyYouHaveNoNotesLabel();
        addTestStep("Clicked on 'Notes' option in 'My Library' and verified application is navigated to the same page");

        navigateToHomePage();
        homePage.clickMyLibrary();
        myLibraryDropDown.clickOwned();
        OwnedPage ownedPage = new OwnedPage();
        ownedPage.verifyNoOwnedContent();
        addTestStep("Clicked on 'Owned' option in 'My Library' and verified application is navigated to the same page");

        navigateToHomePage();
        homePage.clickMyLibrary();
        myLibraryDropDown.clickCredits();
        CreditsPage creditsPage = new CreditsPage();
        creditsPage.verifyCreditsPage();
        addTestStep("Clicked on 'Credits' option in 'My Library' and verified application is navigated to the same page");

        navigateToHomePage();
        homePage.clickRecent();
        addTestStep("Clicked on 'Recent'");

        RecentPage recentPage = new RecentPage();
        recentPage.verifyNoResultFoundMessage();
        addTestStep("Verified 'No result found' text is displayed in recent page");

        navigateToHomePage();
        homePage.clickMyAccount();
        addTestStep("Clicked on 'My Account'");

        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.verifyMyAccountLabel();
        addTestStep("Verified application is navigated to 'My Account' page");

        navigateToHomePage();
        homePage.clickEditPreferencesLink();
        addTestStep("Clicked on 'Edit Preferenced' link");

        EditPreferencesPage editPreferencesPage = new EditPreferencesPage();
        editPreferencesPage.verifyPickYourInterests();
        addTestStep("Verified 'Pick Your Interests' text in 'Edit Your Preferences'");
    }


    /*@Test
    public void search() {
        mainPage.searchButton.click();

        $("[data-test='search-input']").sendKeys("Selenium");
        $("button[data-test='full-search-button']").click();

        $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
    }*/

   /* @Test
    public void toolsMenu() {
        mainPage.toolsMenu.click();

        $("div[data-test='main-submenu']").shouldBe(visible);
    }*/

    /*@Test
    public void navigationToAllTools() {
        mainPage.seeDeveloperToolsButton.click();
        mainPage.findYourToolsButton.click();

        $("#products-page").shouldBe(visible);

assertEquals(Selenide.title(), "All Developer Tools and Products by JetBrains");    }*/
}
