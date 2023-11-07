package com.example.demo;
import com.codeborne.selenide.SelenideElement;
import com.google.auto.common.Visibility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

// page_url = https://www.jetbrains.com/
public class Helper {

    public static WebDriver driver;

    @BeforeTest
    public void setUp(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Akanksha\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public void ValidateEquals(String actualResult, String expectedResult, String msg){
        Assert.assertEquals(actualResult,expectedResult,msg);
        System.out.println("'"+msg+"'"+",ACTUAL:"+actualResult+",EXPECTED:"+expectedResult);
    }

    public void navigateToHomePage(){
        driver.get("https://subscription.packtpub.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void backspace(){
        driver.navigate().back();
    }

    public void addTestStep(String step){
        System.out.println(step);
    }
}
