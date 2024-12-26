package com.batch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HeadlessEdgeBrowserInit {
    WebDriver driver;
    @BeforeSuite

    public void startEdgeBrowser(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options= new EdgeOptions();
        options.addArguments("--headless=new");
        driver= new EdgeDriver (options);
        //driver.manage().window().maximize();
    }
    @Test

    public void openURL() throws InterruptedException {
        driver.get("https://www.aarong.com/");
       // Thread.sleep(70000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @AfterSuite

    public void closeEdgeBrowser(){
        driver.close();

    }
}

