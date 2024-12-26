package com.batch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HeadlessFirefoxBrowserInit {
    WebDriver driver;
    @BeforeSuite

    public void startFirefoxBrowser(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options= new FirefoxOptions();
        options.addArguments("--headless=new");
        driver= new FirefoxDriver (options);
        driver.manage().window().maximize();
    }
    @Test

    public void openURL() throws InterruptedException {
        driver.get("https://www.aarong.com/");
        Thread.sleep(20000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @AfterSuite

    public void closeFirefoxBrowser(){
        driver.close();

    }
}
