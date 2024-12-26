package com.batch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserCommandsExample {
    String url="https://www.aarong.com/";
    WebDriver driver;
    @BeforeSuite

    public void startChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void getCurrentURL() throws InterruptedException {
        driver.get(url);
        Thread.sleep(5000);
        String currentURL = driver.getCurrentUrl().toString();
        System.out.println(currentURL);
        if (url.equals(currentURL)) {
            System.out.println("Current URL is same as the required URL");
        } else {
            System.out.println("Current URL is not same as the required URL");
        }
    }
    @Test
    public void getPageSource(){
        System.out.println(driver.getPageSource());
    }
        @AfterSuite

        public void closeChromeBrowser(){
            driver.quit();
        }
    }


