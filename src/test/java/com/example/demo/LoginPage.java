package com.example.demo;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import javax.validation.Valid;

// page_url = https://www.jetbrains.com/
public class LoginPage extends Helper {

    WebElement START_FREE_TRIAL;
    WebElement YOUR_SUGGESTIONS_TITLE;

    WebElement USER_NAME = driver.findElement(By.xpath("//input[@id='inline-form-input-username']"));
    WebElement PASSWORD = driver.findElement(By.xpath("//input[@type='password']"));
    WebElement SIGN_IN_BUTTON = driver.findElement(By.xpath("//span[text()='sign in']/ancestor::button"));
    WebElement PACKTLOGO = driver.findElement(By.xpath("//img[@class='logo']"));
    WebElement FORGOT_PASSWORD = driver.findElement(By.xpath("//a[@class='btn btn-link forgot-password-link']"));
    WebElement SIGN_IN_TEXT = driver.findElement(By.xpath("//div[@class='login-page__main__container__login__form__heading']"));
    WebElement SIGN_IN_WITH_GITHUB_OPTION = driver.findElement(By.xpath("//i[@class='fa fa-github']/ancestor::button"));
    WebElement DONT_HAVE_AN_ACCOUNT_TEXT = driver.findElement(By.xpath("//span[text()='Don’t have an account?']"));
    WebElement CREATE_ACCOUNT_BUTTON = driver.findElement(By.xpath("//a[@class='login-page__main__container__login__form__button__create']"));

    public void login(String userName, String password) {
        verifyPacktLogo();
        verifySignInText();
        verifySignInWithGithubButton();
        verifyDonthaveAccountText();
        verifyCreateAccountText();
        verifyForgotPassword();
        USER_NAME.click();
        USER_NAME.sendKeys(userName);
        PASSWORD.click();
        PASSWORD.sendKeys(password);
        SIGN_IN_BUTTON.click();
        waitForHomePage();
    }

    public void verifyPacktLogo() {
        Assert.assertEquals(PACKTLOGO.isDisplayed(), true, "Verified Packt Logo");
    }

    public void verifyForgotPassword() {
        String forgotPassword = FORGOT_PASSWORD.getText();
        ValidateEquals(forgotPassword, "Forgot Password?", "Verified forgot password");
    }

    public void verifySignInText() {
        String signIn = SIGN_IN_TEXT.getText();
        ValidateEquals(signIn, "Sign In", "Verified Sign in text on top");
    }

    public void verifySignInWithGithubButton() {
        Assert.assertEquals(SIGN_IN_WITH_GITHUB_OPTION.isDisplayed(), true, "Verified Sign In with Github button");
    }

    public void verifyDonthaveAccountText() {
        Assert.assertEquals(DONT_HAVE_AN_ACCOUNT_TEXT.isDisplayed(), true, "Verified Dont Have and Account? Text");
    }

    public void verifyCreateAccountText() {
        String createAccount = CREATE_ACCOUNT_BUTTON.getText();
        ValidateEquals(createAccount, "CREATE ACCOUNT", "Verified create account button");
    }

    public void waitForHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        START_FREE_TRIAL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Start FREE trial']")));
        YOUR_SUGGESTIONS_TITLE = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='d-flex justify-content-center']/h2[@class='suggested_title']")));
    }

    public String checkColor() {
        START_FREE_TRIAL = driver.findElement(By.xpath("//a[text()='Start FREE trial']"));
        String buttonColor = START_FREE_TRIAL.getCssValue("color");
        return buttonColor;
    }
}


